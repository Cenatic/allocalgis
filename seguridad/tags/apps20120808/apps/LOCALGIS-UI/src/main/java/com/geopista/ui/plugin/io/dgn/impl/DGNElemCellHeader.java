/*
 * Created on 17-jul-2003
 *
 * Copyright (c) 2003
 * Francisco José Peñarrubia Martínez
 * IVER Tecnologías de la Información S.A.
 * Salamanca 50
 * 46005 Valencia (        SPAIN )
 * +34 963163400
 * mailto:fran@iver.es
 * http://www.iver.es
 */
/* gvSIG. Sistema de Informaci�n Geogr�fica de la Generalitat Valenciana
 *
 * Copyright (C) 2004 IVER T.I. and Generalitat Valenciana.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307,USA.
 *
 * For more information, contact:
 *
 *  Generalitat Valenciana
 *   Conselleria d'Infraestructures i Transport
 *   Av. Blasco Ib��ez, 50
 *   46010 VALENCIA
 *   SPAIN
 *
 *      +34 963862235
 *   gvsig@gva.es
 *      www.gvsig.gva.es
 *
 *    or
 *
 *   IVER T.I. S.A
 *   Salamanca 50
 *   46005 Valencia
 *   Spain
 *
 *   +34 963163400
 *   dac@iver.es
 */
package com.geopista.ui.plugin.io.dgn.impl;

/**
 * Clase utilizada para guardar un elemento de tipo CellHeader. 
 *
 * @author Vicente Caballero Navarro
 */
public class DGNElemCellHeader extends DGNElemCore {
	//DGNElemCore core;
	public int totlength; /*!< Total length of cell */
	public byte[] name = new byte[7]; //7           /*!< Cell name */
	public int cclass; /*!< Class bitmap */
	public int[] levels = new int[4]; //4         /*!< Levels used in cell */
	public DGNPoint rnglow = new DGNPoint(); /*!< X/Y/Z minimums for cell */
	public DGNPoint rnghigh = new DGNPoint(); /*!< X/Y/Z minimums for cell */
	public double[] trans = new double[9];

	//9          /*!< 2D/3D Transformation Matrix */
	public DGNPoint origin = new DGNPoint(); /*!< Cell Origin */
	public double xscale;
	public double yscale;
	public double rotation;
}
