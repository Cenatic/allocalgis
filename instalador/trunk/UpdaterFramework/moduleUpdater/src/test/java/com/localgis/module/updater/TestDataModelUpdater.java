/**
 * TestDataModelUpdater.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.localgis.module.updater;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

import org.apache.maven.artifact.DefaultArtifact;
import org.apache.maven.artifact.versioning.VersionRange;
import org.junit.Test;

import com.localgis.module.updater.impl.DataModelUpdater;
import com.localgis.tools.modules.Artifact;
import com.localgis.tools.modules.Module;
import com.localgis.tools.modules.exception.DependencyViolationException;
import com.localgis.tools.modules.impl.ArtifactImpl;
import com.localgis.tools.modules.impl.ModuleImpl;
import com.localgis.tools.modules.impl.VersionImpl;

public class TestDataModelUpdater extends LocalgisUpdaterTester
{
/**
 * Definir un módulo ficticio de ejemplo para las pruebas
 */
    @Override
    protected Module getTestModule()
    {
	Module mod= new ModuleImpl("Registry Services Data Model", "3.0");
	
	// Artifact que contiene los ficheros reales a distribuir
	org.apache.maven.artifact.Artifact artifact = getMavenActifact();
	// Este datamodeldemo hay que crearlo con el único objetivo de probar que todo funciona
	artifact.setFile(new File("target/test-classes/RegistryDataModel-3.0.0-SNAPSHOT.jar"));
//	artifact.setFile(new File("test/resources/RegistryDataModel-3.0.0-SNAPSHOT.jar"));
	Artifact localgisArtifact=new ArtifactImpl(artifact.getGroupId(),
						artifact.getArtifactId(),
						new VersionImpl(artifact.getVersion()),
						Artifact.DATA_MODEL_INSTALLER, null);
	mod.setArtifact(localgisArtifact);
	
	return mod;
    }
/**
 * Artifact que representa el binario que contiene la información para la instalación.
 * @return
 */
    @Override
public org.apache.maven.artifact.Artifact getMavenActifact()
{
    org.apache.maven.artifact.Artifact artifact= new DefaultArtifact("com.localgis.datamodel",
    					"RegistryDataModel", VersionRange.createFromVersion("3.0.0-SNAPSHOT"),
    					"compile", "jar", "jar", null);
    artifact.setFile(new File("target/test-classes/RegistryDataModel-3.0.0-SNAPSHOT.jar"));
    return artifact;
}

    @Override
    protected Updater instantiateUpdater()
    {
	return new DataModelUpdater();
    }
/**
 * TODO Definir en este método la lista simulada de binarios que hay que manejar para los casos de prueba.
 */
    @Override
    protected Set<org.apache.maven.artifact.Artifact> createTestDependencyList()
    {
	
	Set<org.apache.maven.artifact.Artifact> deps=new HashSet<org.apache.maven.artifact.Artifact>();
	
	return deps;
    }
    
    @Test
    public void testFileCorrupt() throws DependencyViolationException
    {
    	//TODO: PENDIENTE INDICAR CONDICIONES PARA COMPROBACION FICHERO VALIDO (no deberia invocarse a install ya que lo ejecutara dos veces)
//    	updater.getBinaryArtifact().setFile(new File("nonexistent.jar"));
//    	try {
//			updater.install();
//			Assert.fail();
//		} catch (RuntimeException e) {
//			Assert.assertTrue(e.getCause() instanceof FileNotFoundException);
//		}
		Assert.assertFalse(updater.checkInstallationValidity());  	
    }

}
