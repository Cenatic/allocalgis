/**
 * UTMED50ToGeoETRS89Converter.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.instalador;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.apache.log4j.Logger;
import org.postgis.PGgeometry;
import org.postgresql.util.PSQLException;

import com.geopista.instalador.util.Ed50toetrs89Connection;
import com.geopista.instalador.util.Ed50toetrs89Utils;
import com.geopista.instalador.util.Messages;
import com.vividsolutions.jts.io.ParseException;

public class UTMED50ToGeoETRS89Converter {

	// Contiene los nombres de los campos de tipo GEOMETRY que se desean
	// convertir.
	// Se especifican el el fichero conexion.properties
	private static final String DDBB_GEOM_COLUMNS_TRANSFORM = "database.transformColumnName";
	// Sufijo de la columna de tipo GEOMETRY que se genera para realziar una
	// copia de los datos,
	// y a partir de ah� generar los datos transformados
	public static final String BACUP_SUFFIX = "old50";

	private static final String DDBB_GEOM_NOTINCLUDE_TABLES_TRANSFORM = "database.transformNotIncludeTables";

	private static final int PROGRESS_NUMBER = 1000;

	// lista de claves por las que hay que convertir
	private static final String UNIQUE_KEY = "uniqueKey";

	// lista de constraint que se deben eliminar
	private static final String DROP_CONSTRAINT = "drop.Constraint";

	private static final String DEFAULT_TARGET_SRID = "default.target.srid";

	private static final String MUNICIPALITIES_CONVERT = "municipios";

	public static org.apache.log4j.Logger log = Logger
			.getLogger(UTMED50ToGeoETRS89Converter.class);

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws org.apache.commons.cli.ParseException
	 */
	public static void main(String[] args) throws IOException, SQLException,
			ClassNotFoundException, ParseException {
		final UTMED50ToGeoETRS89Converter uTMED50ToGeoED50Converter = new UTMED50ToGeoETRS89Converter();
		// create Options object
		final Options options = new Options();
		Connection con = null;

		options.addOption("f", "file", true,
				Messages.getString("Fichero.de.configuracion"));
		options.addOption("t", "trans", false,
				Messages.getString("UTMED50ToGeoETRS89Converter.13"));
		options.addOption("i", "info", false,
				Messages.getString("UTMED50ToGeoETRS89Converter.16"));
		options.addOption("n", "names", false,
				Messages.getString("UTMED50ToGeoETRS89Converter.19"));
		options.addOption("d", "delbackup", false,
				Messages.getString("borrarBackup"));
		options.addOption("o", "deloldbackup", false,
				Messages.getString("borraroldBackup"));
		options.addOption("r", "other", false,
				Messages.getString("updatelocalgistables"));
		options.addOption("m", "municipality", false,
				Messages.getString("municipalityconvert"));
		// Option logfile = OptionBuilder.withArgName( "file" )
		// .hasArg(2)
		// .withDescription( "Fichero a procesar." )
		// .create( "logfile" );

		final CommandLineParser parser = new PosixParser();
		CommandLine cmd;
		try {
			cmd = parser.parse(options, args);

			final HelpFormatter formatter = new HelpFormatter();

			if (cmd.hasOption("f")) {
				final Properties properties = loadParameters(cmd
						.getOptionValue("f"));

				con = Ed50toetrs89Connection.getConnection(properties);

				if (cmd.hasOption("t")) {
					uTMED50ToGeoED50Converter
							.transformDataBase(
									properties
											.getProperty(DDBB_GEOM_COLUMNS_TRANSFORM),
									properties
											.getProperty(DDBB_GEOM_NOTINCLUDE_TABLES_TRANSFORM),
									properties.getProperty(UNIQUE_KEY),
									properties.getProperty(DROP_CONSTRAINT),
									properties.getProperty(DEFAULT_TARGET_SRID),
									con);

				} else if (cmd.hasOption("m")) {
					uTMED50ToGeoED50Converter
							.transformDataBaseMunicipality(
									properties
											.getProperty(DDBB_GEOM_COLUMNS_TRANSFORM),
									properties
											.getProperty(DDBB_GEOM_NOTINCLUDE_TABLES_TRANSFORM),
									properties.getProperty(UNIQUE_KEY),
									properties.getProperty(DROP_CONSTRAINT),
									properties.getProperty(DEFAULT_TARGET_SRID),
									properties
											.getProperty(MUNICIPALITIES_CONVERT),
									con);

				} else if (cmd.hasOption("i")) {
					Ed50toetrs89Utils.showTablesWithGeometryColumn(con);

				} else if (cmd.hasOption("n")) {
					Ed50toetrs89Utils.showDistinctGeometryColumns(con);

				} else if (cmd.hasOption("d")) {
					Ed50toetrs89Utils.dropBackupColumn(
							con,
							Arrays.asList(properties.getProperty(
									DDBB_GEOM_COLUMNS_TRANSFORM).split(";")));

				} else if (cmd.hasOption("o")) {
					Ed50toetrs89Utils.dropBackupColumnLocalGIS(con);

				} else if (cmd.hasOption("r")) {
					updateLocalgisTables(con);

				} else {
					usage();
					formatter
							.printHelp(
									Messages.getString("UTMED50ToGeoETRS89Converter.0"),
									options);
				}
			} else {
				usage();
				formatter.printHelp(
						Messages.getString("UTMED50ToGeoETRS89Converter.1"),
						options);
			}

		} catch (org.apache.commons.cli.ParseException e) {

			log.error(e);
		} catch (PSQLException e) {
			printMessage(Messages.getString("UTMED50ToGeoETRS89Converter.27"));
			log.error(e);
			throw e;
		} finally {

			Ed50toetrs89Connection.closeConnection(con, null, null);
		}

	}

	public static void usage() {

		printMessage(Messages.getString("UTMED50ToGeoETRS89Converter.2"));

	}

	/**
	 * Carga los datos del fichero de propiedades
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static Properties loadParameters(final String filePath)
			throws IOException {
		// Cargamos datos del fichero de propiedades

		Properties properties = new Properties();

		printMessage(Messages.getString("UTMED50ToGeoETRS89Converter.29"));

		final FileInputStream entradaParametro = new FileInputStream(filePath);
		properties.load(entradaParametro);

		return properties;
	}

	public static void printMessage(final String message) {
		printMessage(message, true, true);
	}

	private static void printMessage(final String message,
			final boolean showInLog, boolean newLine) {
		if (newLine) {
			System.out.println(message);
		} else {
			System.out.print(message);
		}
		if (showInLog) {
			log.info(message);
		}

	}

	/**
	 * Realiza la conviersion de los campos de tipo GEOMETRY especificados
	 * 
	 * @param columnsToTransform
	 * @param con
	 * @throws IOException
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws ParseException
	 */
	private void transformDataBase(String columnsToTransform,
			String tablesNotIncludesTransform, String uniqueKeys,
			String dropConstraint, String defaultTargetSrid, Connection con)
			throws IOException, SQLException, ClassNotFoundException,
			ParseException {

		long processStartTime = System.currentTimeMillis();
		printMessage(Messages.getString("UTMED50ToGeoETRS89Converter.42"));

		String[] columnsToTransformList = columnsToTransform.split(";");

		String[] listUniqueKeys = uniqueKeys.split(";");

		String[] listDropConstraint = null;
		if (!"".equals(dropConstraint.trim())) {
			listDropConstraint = dropConstraint.split(";");
		}
		int defaultTargetSridInt = 0;

		try {
			defaultTargetSridInt = (new Integer(defaultTargetSrid)).intValue();
		} catch (Exception e) {
			defaultTargetSridInt = 0;
		}

		List<String>  lstTablesNotIncludesTransform =
		  Arrays.asList(tablesNotIncludesTransform.split(";"));

		for (int n = 0; n < columnsToTransformList.length; n++)

		{

			long countTransformTables = 0;

			String geometryColumnName = columnsToTransformList[n];

			List<String> tablesWithColumnName = Ed50toetrs89Utils
					.getTablesWithGeometryColumn(con, geometryColumnName);

			printMessage(Messages.getString("UTMED50ToGeoETRS89Converter.44")
					+ tablesWithColumnName.size()
					+ Messages.getString("UTMED50ToGeoETRS89Converter.45")
					+ geometryColumnName);

			Iterator<String> tablesWithColumnNameIterator = tablesWithColumnName
					.iterator();

			while (tablesWithColumnNameIterator.hasNext()) {

				long tableStartTime = System.currentTimeMillis();

				printMessage("");
				printMessage("-------------------------------------------------");
				printMessage("");

				String tabla = (String) tablesWithColumnNameIterator.next();

				 if(lstTablesNotIncludesTransform.contains(tabla)){
					 printMessage("Tabla "+ tabla + " excluida de la conversion");
				 continue;
				}
				 
				
				// Para cada tabla inicializamos las variables
				boolean fieldGeometry = false;
				boolean fieldGeometryBackup = false;
				boolean[] campos = new boolean[] { false, false };

				printMessage(Messages
						.getString("UTMED50ToGeoETRS89Converter.46")
						+ tabla
						+ Messages.getString("UTMED50ToGeoETRS89Converter.47")
						+ geometryColumnName);
				printMessage(Messages
						.getString("UTMED50ToGeoETRS89Converter.48")
						+ (++countTransformTables)
						+ "/"
						+ tablesWithColumnName.size());

				// Realizamos una consulta para obtener los nombres de los
				// campos de las tablas y comprobar si
				// GEOMETRY50 y GEOMETRY ya est�n creadas
				campos = Ed50toetrs89Utils.validaciones(con, tabla,
						geometryColumnName);
				fieldGeometryBackup = campos[0];
				fieldGeometry = campos[1];

				if (fieldGeometryBackup && fieldGeometry) {

					boolean tableConversion = Ed50toetrs89Utils
							.checkTableConversion(con, tabla,
									geometryColumnName);

					// Si existen columnas nulas en GEOMETRY es que se
					// necesita realizar la transformaci�n
					if (tableConversion) {

						printMessage(Messages
								.getString("UTMED50ToGeoETRS89Converter.50")
								+ tabla
								+ Messages
										.getString("UTMED50ToGeoETRS89Converter.51"));
						try {
							makeConversionWithListKeys(con, tabla,
									geometryColumnName, listUniqueKeys,
									listDropConstraint, defaultTargetSridInt);
						} catch (SQLException e) {
							// si falla copiar tabla continuamos con
							// la
							// siguiente ya que no hay copia de seguridad.

							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.52"));

						} catch (ParseException e) {
							// Si falla la conversion de alguno de los
							// registro
							// de la tabla seguimos con la siguiente
							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.53"));

						}

					} else {
						printMessage(Messages
								.getString("UTMED50ToGeoETRS89Converter.54")
								+ tabla
								+ Messages
										.getString("UTMED50ToGeoETRS89Converter.55"));
					}
				} else {
					if (!fieldGeometryBackup) {

						try {
							Ed50toetrs89Utils
									.copyGeometryColumnToGeometryBackup(con,
											tabla, geometryColumnName);
							makeConversionWithListKeys(con, tabla,
									geometryColumnName, listUniqueKeys,
									listDropConstraint, defaultTargetSridInt);
						} catch (SQLException e) {
							// si falla al renombrar tabla continuamos con
							// la
							// siguiente ya que no hay copia de seguridad.
							// Si falla al crear columna GEOMETRY seguimos
							// con
							// la siguiente tabla;
							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.56"));
							continue;
						} catch (ParseException e) {
							// Si falla la conversion de alguno de los
							// registros
							// de la tabla seguimos con la siguiente
							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.57"));

						}
					}
				}

				long tableEndTime = System.currentTimeMillis();
				printMessage(Messages
						.getString("UTMED50ToGeoETRS89Converter.60")
						+ tabla
						+ Messages.getString("UTMED50ToGeoETRS89Converter.61")
						+ (tableEndTime - tableStartTime)
						+ Messages.getString("UTMED50ToGeoETRS89Converter.62"));
			}
		}

		printMessage(Messages.getString("UTMED50ToGeoETRS89Converter.63"));
		long processEndTime = System.currentTimeMillis();
		printMessage(Messages.getString("UTMED50ToGeoETRS89Converter.64")
				+ (processEndTime - processStartTime)
				+ Messages.getString("UTMED50ToGeoETRS89Converter.65"));

	}

	/**
	 * Realiza la conviersion de los campos de tipo GEOMETRY especificados
	 * 
	 * @param columnsToTransform
	 * @param con
	 * @throws IOException
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws ParseException
	 */
	private void transformDataBaseMunicipality(String columnsToTransform,
			String tablesNotIncludesTransform, String uniqueKeys,
			String dropConstraint, String defaultTargetSrid,
			String municipalities, Connection con) throws IOException,
			SQLException, ClassNotFoundException, ParseException {

		long processStartTime = System.currentTimeMillis();
		printMessage(Messages.getString("UTMED50ToGeoETRS89Converter.42"));

		String[] columnsToTransformList = columnsToTransform.split(";");

		String[] listUniqueKeys = uniqueKeys.split(";");

		String[] listDropConstraint = null;
		if (!"".equals(dropConstraint.trim())) {
			listDropConstraint = dropConstraint.split(";");
		}
		int defaultTargetSridInt = 0;

		try {
			defaultTargetSridInt = (new Integer(defaultTargetSrid)).intValue();
		} catch (Exception e) {
			defaultTargetSridInt = 0;
		}

		String[] municipalitiesToTransformList = municipalities.split(";");

		for (int m = 0; m < municipalitiesToTransformList.length; m++) {
			
			printMessage("Comenzando conversion para el municipio: "+ municipalitiesToTransformList[m]);
			
			for (int n = 0; n < columnsToTransformList.length; n++)

			{

				long countTransformTables = 0;

				String geometryColumnName = columnsToTransformList[n];

				List<String> tablesWithColumnName = Ed50toetrs89Utils
						.getTablesWithGeometryColumnMunicipalities(con, geometryColumnName);

				printMessage(Messages
						.getString("UTMED50ToGeoETRS89Converter.44")
						+ tablesWithColumnName.size()
						+ Messages.getString("UTMED50ToGeoETRS89Converter.45")
						+ geometryColumnName);

				Iterator<String> tablesWithColumnNameIterator = tablesWithColumnName
						.iterator();

				while (tablesWithColumnNameIterator.hasNext()) {

					long tableStartTime = System.currentTimeMillis();

					printMessage("");
					printMessage("-------------------------------------------------");
					printMessage("");

					String tabla = (String) tablesWithColumnNameIterator.next();

					// if(lstTablesNotIncludesTransform.contains(tabla)){
					// continue;
					// }

					// Para cada tabla inicializamos las variables
					boolean fieldGeometry = false;
					boolean fieldGeometryBackup = false;
					boolean[] campos = new boolean[] { false, false };

					printMessage(Messages
							.getString("UTMED50ToGeoETRS89Converter.46")
							+ tabla
							+ Messages
									.getString("UTMED50ToGeoETRS89Converter.47")
							+ geometryColumnName);
					printMessage(Messages
							.getString("UTMED50ToGeoETRS89Converter.48")
							+ (++countTransformTables)
							+ "/"
							+ tablesWithColumnName.size());

					// Realizamos una consulta para obtener los nombres de los
					// campos de las tablas y comprobar si
					// GEOMETRY50 y GEOMETRY ya est�n creadas
					campos = Ed50toetrs89Utils.validaciones(con, tabla,
							geometryColumnName);
					fieldGeometryBackup = campos[0];
					fieldGeometry = campos[1];

					if (fieldGeometryBackup && fieldGeometry) {

						Ed50toetrs89Utils
						.copyMunicipalitiesGeometryColumnToGeometryBackup(
								con, tabla, geometryColumnName, municipalitiesToTransformList[m]);
						
						boolean tableConversion = Ed50toetrs89Utils
								.checkMunicipalitiesTableConversion(con, tabla,
										geometryColumnName, municipalitiesToTransformList[m]);

						// Si existen columnas nulas en GEOMETRY es que se
						// necesita realizar la transformaci�n
						if (tableConversion) {

							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.50")
									+ tabla
									+ Messages
											.getString("UTMED50ToGeoETRS89Converter.51"));
							try {
								makeMunicipalitiesConversionWithListKeys(con, tabla,
										geometryColumnName, listUniqueKeys,
										listDropConstraint,
										defaultTargetSridInt, municipalitiesToTransformList[m]);
							} catch (SQLException e) {
								// si falla copiar tabla continuamos con
								// la
								// siguiente ya que no hay copia de seguridad.

								printMessage(Messages
										.getString("UTMED50ToGeoETRS89Converter.52"));

							} catch (ParseException e) {
								// Si falla la conversion de alguno de los
								// registro
								// de la tabla seguimos con la siguiente
								printMessage(Messages
										.getString("UTMED50ToGeoETRS89Converter.53"));

							}

						} else {
							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.54")
									+ tabla
									+ Messages
											.getString("UTMED50ToGeoETRS89Converter.55"));
						}
					} else {
						if (!fieldGeometryBackup) {

							try {
								Ed50toetrs89Utils
										.copyMunicipalitiesGeometryColumnToGeometryBackup(
												con, tabla, geometryColumnName, municipalitiesToTransformList[m]);
								makeMunicipalitiesConversionWithListKeys(con, tabla,
										geometryColumnName, listUniqueKeys,
										listDropConstraint,
										defaultTargetSridInt, municipalitiesToTransformList[m]);
							} catch (SQLException e) {
								// si falla al renombrar tabla continuamos con
								// la
								// siguiente ya que no hay copia de seguridad.
								// Si falla al crear columna GEOMETRY seguimos
								// con
								// la siguiente tabla;
								printMessage(Messages
										.getString("UTMED50ToGeoETRS89Converter.56"));
								continue;
							} catch (ParseException e) {
								// Si falla la conversion de alguno de los
								// registros
								// de la tabla seguimos con la siguiente
								printMessage(Messages
										.getString("UTMED50ToGeoETRS89Converter.57"));

							}
						}
					}

					long tableEndTime = System.currentTimeMillis();
					printMessage(Messages
							.getString("UTMED50ToGeoETRS89Converter.60")
							+ tabla
							+ Messages
									.getString("UTMED50ToGeoETRS89Converter.61")
							+ (tableEndTime - tableStartTime)
							+ Messages
									.getString("UTMED50ToGeoETRS89Converter.62"));
				}
			}

		}
		printMessage(Messages.getString("UTMED50ToGeoETRS89Converter.63"));
		long processEndTime = System.currentTimeMillis();
		printMessage(Messages.getString("UTMED50ToGeoETRS89Converter.64")
				+ (processEndTime - processStartTime)
				+ Messages.getString("UTMED50ToGeoETRS89Converter.65"));

	}

	private static void updateLocalgisTables(Connection con)
			throws SQLException {
		try {
			Ed50toetrs89Utils.updateSridTable(con, "entidad_supramunicipal",
					"srid");

			printMessage("Se ha transformado correctamente la tabla entidad_supramunicipal");
		} catch (SQLException e) {
			printMessage("No se ha podido convertir correctamente la tabla entidad_supramunicipal");

		}
		try {
			Ed50toetrs89Utils.updateStringSridTable(con, "municipios", "srid");
			Ed50toetrs89Utils.updateSridTable(con, "municipios",
					"srid_proyeccion");

			printMessage("Se ha transformado correctamente la tabla municipios");
		} catch (SQLException e) {
			printMessage("No se ha podido convertir correctamente la tabla municipios");

		}

		try {
			Ed50toetrs89Utils.updateMapsTable(con);

			printMessage("Se ha transformado correctamente la tabla maps");
		} catch (SQLException e) {
			printMessage("No se ha podido convertir correctamente la tabla maps");

		}

	}

	private static void makeConversionWithListKeys(Connection con,
			String table, String geometryColumnName, String[] listUniqueKeys,
			String[] listDropConstraint, int defaultTargetSrid)
			throws SQLException, ParseException {
		boolean correctConversion = false;

		Ed50toetrs89Utils.dropConstraintList(con, table, listDropConstraint);

		for (int m = 0; m < listUniqueKeys.length; m++) {
			try {
				makeConversion(con, table, geometryColumnName,
						listUniqueKeys[m], defaultTargetSrid);
				correctConversion = true;
				break;
			} catch (SQLException e) {
				if (e.getMessage().contains("no existe la columna")) {
					UTMED50ToGeoETRS89Converter.printMessage("La tabla "
							+ table + " no tiene la columna de clave �nica "
							+ listUniqueKeys[m]);
				} else {
					e.printStackTrace();
					printMessage(Messages
							.getString("UTMED50ToGeoETRS89Converter.88")
							+ table);
					printMessage(e.getMessage());
					throw e;
				}

			}
		}

		if (!correctConversion) {
			printMessage("la tabla " + table + " no ha podido convertirse");
		}

	}
	
	private static void makeMunicipalitiesConversionWithListKeys(Connection con,
			String table, String geometryColumnName, String[] listUniqueKeys,
			String[] listDropConstraint, int defaultTargetSrid, String idMunicipio)
			throws SQLException, ParseException {
		boolean correctConversion = false;

		Ed50toetrs89Utils.dropConstraintList(con, table, listDropConstraint);

		for (int m = 0; m < listUniqueKeys.length; m++) {
			try {
				makeMunicipalitiesConversion(con, table, geometryColumnName,
						listUniqueKeys[m], defaultTargetSrid, idMunicipio);
				correctConversion = true;
				break;
			} catch (SQLException e) {
				if (e.getMessage().contains("no existe la columna")) {
					UTMED50ToGeoETRS89Converter.printMessage("La tabla "
							+ table + " no tiene la columna de clave �nica "
							+ listUniqueKeys[m]);
				} else {
					e.printStackTrace();
					printMessage(Messages
							.getString("UTMED50ToGeoETRS89Converter.88")
							+ table);
					printMessage(e.getMessage());
					throw e;
				}

			}
		}

		if (!correctConversion) {
			printMessage("la tabla " + table + " no ha podido convertirse");
		}

	}

	private static void makeConversion(Connection con, String tabla,
			String geometryColumnName, String uniqueKeyName,
			int defaultTargetSRID) throws SQLException, ParseException {
		PreparedStatement psActualizarDatos = null;
		ResultSet rsActualizarDatos = null;
		Statement updateStatement = null;
		int maxReg = 100000;
		long minUniqueKey = 0;
		boolean endTable = false;

		{
			try {
				int cont = 0;
				int totalCount = 0;
				boolean badGeometry = false;
				long totalRegistros = 0;
				int targetSRID = 0;
				while (!endTable) {
					// Transformaci�n de coordenadas ED50 a ETRS89 y
					// posterior almacenamiento en la BBDD
					String sSQL = "select " + uniqueKeyName + ", \""
							+ (geometryColumnName + BACUP_SUFFIX)
							+ "\", (select count(*) from \"" + tabla
							+ "\" where \"" + geometryColumnName
							+ "\" is null and \""
							+ (geometryColumnName + BACUP_SUFFIX)
							+ "\" is not null) as totalregistros from \""
							+ tabla + "\" where \"" + geometryColumnName
							+ "\" is null and \""
							+ (geometryColumnName + BACUP_SUFFIX)
							+ "\" is not null  and " + uniqueKeyName + " > "
							+ minUniqueKey + " order by " + uniqueKeyName
							+ " limit " + maxReg;
					psActualizarDatos = con.prepareStatement(sSQL);
					rsActualizarDatos = psActualizarDatos.executeQuery();
					// recorremos cada uno de los registros para
					// actualizar su geometr�a. Si no se ha devuelto
					// ning�n registro
					// es que la tabla estaba vac�a, y no se
					// transformar�n, dado que no hay registro
					// alguno

					endTable = true;
					updateStatement = con.createStatement();
					while (rsActualizarDatos.next()) {

						endTable = false;

						long uniqueKeyValue = rsActualizarDatos
								.getInt(uniqueKeyName);

						minUniqueKey = uniqueKeyValue;

						totalRegistros = rsActualizarDatos
								.getInt("totalregistros");

						if (totalRegistros == 0) {
							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.76")
									+ tabla
									+ Messages
											.getString("UTMED50ToGeoETRS89Converter.77"));
							continue;
						}
						PGgeometry pgGeometry = (PGgeometry) rsActualizarDatos
								.getObject(geometryColumnName + BACUP_SUFFIX);

						if (totalCount == 0) {
							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.78")
									+ totalRegistros
									+ Messages
											.getString("UTMED50ToGeoETRS89Converter.79")
									+ tabla);
							targetSRID = Ed50toetrs89Utils
									.getTargetSrid(pgGeometry.getGeometry()
											.getSrid());
							if (targetSRID != 0) {
								defaultTargetSRID = targetSRID;
							}

						}

						// Si es nulo es que no tiene dato de
						// Geometr�a y por lo tanto no se podr�
						// convertir
						if (pgGeometry != null) {

							try {
								Ed50toetrs89Utils
										.updateTransformGeometryColumn(con,
												tabla, uniqueKeyValue,
												uniqueKeyName, pgGeometry,
												geometryColumnName);
								totalCount++;
							} catch (ParseException e) {
								log.error(e);
								printMessage(e.getMessage());
								printMessage(Messages
										.getString("UTMED50ToGeoETRS89Converter.80")
										+ uniqueKeyValue
										+ Messages
												.getString("UTMED50ToGeoETRS89Converter.81")
										+ tabla);
								badGeometry = true;

							}

						}

						cont++;
						if (cont == PROGRESS_NUMBER) {
							printMessage("#", false, false);
							cont = 0;
						}
					}

					Ed50toetrs89Utils.updateTableGeometryColumn(con, tabla,
							geometryColumnName, defaultTargetSRID);

					if (endTable) {
						if (badGeometry) {

							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.83")
									+ (totalRegistros - totalCount)
									+ Messages
											.getString("UTMED50ToGeoETRS89Converter.84")
									+ totalRegistros);
							throw new ParseException(
									Messages.getString("UTMED50ToGeoETRS89Converter.85"));
						} else {
							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.86")
									+ totalCount
									+ Messages
											.getString("UTMED50ToGeoETRS89Converter.87")
									+ tabla);
						}
					}
				}

			} catch (ParseException e) {
				e.printStackTrace();
				printMessage(Messages
						.getString("UTMED50ToGeoETRS89Converter.89") + tabla);
				printMessage(e.getMessage());
				throw e;

			} finally {
				Ed50toetrs89Connection.closeConnection(null, psActualizarDatos,
						rsActualizarDatos);
			}

		}
	}
	
	private static void makeMunicipalitiesConversion(Connection con, String tabla,
			String geometryColumnName, String uniqueKeyName,
			int defaultTargetSRID, String idMunicipio) throws SQLException, ParseException {
		PreparedStatement psActualizarDatos = null;
		ResultSet rsActualizarDatos = null;
		Statement updateStatement = null;
		int maxReg = 100000;
		long minUniqueKey = 0;
		boolean endTable = false;

		{
			try {
				int cont = 0;
				int totalCount = 0;
				boolean badGeometry = false;
				long totalRegistros = 0;
				int targetSRID = 0;
				while (!endTable) {
					// Transformaci�n de coordenadas ED50 a ETRS89 y
					// posterior almacenamiento en la BBDD
					String sSQL = "select " + uniqueKeyName + ", \""
							+ (geometryColumnName + BACUP_SUFFIX)
							+ "\", (select count(*) from \"" + tabla
							+ "\" where \"" + geometryColumnName
							+ "\" is null and \""
							+ (geometryColumnName + BACUP_SUFFIX)
							+ "\" is not null and id_municipio = " +idMunicipio+ ") as totalregistros from \""
							+ tabla + "\" where \"" + geometryColumnName
							+ "\" is null and \""
							+ (geometryColumnName + BACUP_SUFFIX)
							+ "\" is not null  and id_municipio = "+ idMunicipio + " and " + uniqueKeyName + " > "
							+ minUniqueKey + " order by " + uniqueKeyName
							+ " limit " + maxReg;
					psActualizarDatos = con.prepareStatement(sSQL);
					rsActualizarDatos = psActualizarDatos.executeQuery();
					// recorremos cada uno de los registros para
					// actualizar su geometr�a. Si no se ha devuelto
					// ning�n registro
					// es que la tabla estaba vac�a, y no se
					// transformar�n, dado que no hay registro
					// alguno

					endTable = true;
					updateStatement = con.createStatement();
					while (rsActualizarDatos.next()) {

						endTable = false;

						long uniqueKeyValue = rsActualizarDatos
								.getInt(uniqueKeyName);

						minUniqueKey = uniqueKeyValue;

						totalRegistros = rsActualizarDatos
								.getInt("totalregistros");

						if (totalRegistros == 0) {
							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.76")
									+ tabla
									+ Messages
											.getString("UTMED50ToGeoETRS89Converter.77"));
							continue;
						}
						PGgeometry pgGeometry = (PGgeometry) rsActualizarDatos
								.getObject(geometryColumnName + BACUP_SUFFIX);

						if (totalCount == 0) {
							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.78")
									+ totalRegistros
									+ Messages
											.getString("UTMED50ToGeoETRS89Converter.79")
									+ tabla);
							targetSRID = Ed50toetrs89Utils
									.getTargetSrid(pgGeometry.getGeometry()
											.getSrid());
							if (targetSRID != 0) {
								defaultTargetSRID = targetSRID;
							}

						}

						// Si es nulo es que no tiene dato de
						// Geometr�a y por lo tanto no se podr�
						// convertir
						if (pgGeometry != null) {

							try {
								Ed50toetrs89Utils
										.updateTransformGeometryColumn(con,
												tabla, uniqueKeyValue,
												uniqueKeyName, pgGeometry,
												geometryColumnName);
								totalCount++;
							} catch (ParseException e) {
								log.error(e);
								printMessage(e.getMessage());
								printMessage(Messages
										.getString("UTMED50ToGeoETRS89Converter.80")
										+ uniqueKeyValue
										+ Messages
												.getString("UTMED50ToGeoETRS89Converter.81")
										+ tabla);
								badGeometry = true;

							}

						}

						cont++;
						if (cont == PROGRESS_NUMBER) {
							printMessage("#", false, false);
							cont = 0;
						}
					}

					Ed50toetrs89Utils.updateTableGeometryColumn(con, tabla,
							geometryColumnName, defaultTargetSRID);

					if (endTable) {
						if (badGeometry) {

							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.83")
									+ (totalRegistros - totalCount)
									+ Messages
											.getString("UTMED50ToGeoETRS89Converter.84")
									+ totalRegistros);
							throw new ParseException(
									Messages.getString("UTMED50ToGeoETRS89Converter.85"));
						} else {
							printMessage(Messages
									.getString("UTMED50ToGeoETRS89Converter.86")
									+ totalCount
									+ Messages
											.getString("UTMED50ToGeoETRS89Converter.87")
									+ tabla);
						}
					}
				}

			} catch (ParseException e) {
				e.printStackTrace();
				printMessage(Messages
						.getString("UTMED50ToGeoETRS89Converter.89") + tabla);
				printMessage(e.getMessage());
				throw e;

			} finally {
				Ed50toetrs89Connection.closeConnection(null, psActualizarDatos,
						rsActualizarDatos);
			}

		}
	}
}
