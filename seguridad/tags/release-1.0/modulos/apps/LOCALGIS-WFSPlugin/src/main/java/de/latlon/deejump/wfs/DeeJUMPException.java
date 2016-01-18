/*
 * (c) 2007 by lat/lon GmbH
 *
 * @author Ugo Taddei (taddei@latlon.de)
 *
 * This program is free software under the GPL (v2.0)
 * Read the file LICENSE.txt coming with the sources for details.
 */
package de.latlon.deejump.wfs;

/**
 * ...
 * 
 * @author <a href="mailto:taddei@lat-lon.de">Ugo Taddei</a>
 * @author last edited by: $Author: satec $
 * 
 * @version 2.0, $Revision: 1.1 $, $Date: 2012/09/12 10:52:04 $
 * 
 * @since 2.0
 */

public class DeeJUMPException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * @param message
     * @param cause
     */
    public DeeJUMPException( String message, Throwable cause ) {
        super( message, cause );
    }

    /**
     * @param cause
     */
    public DeeJUMPException( Throwable cause ) {
        super( cause );
    }

    /**
     * @param msg
     */
    public DeeJUMPException( String msg ) {
        super( msg );
    }

}
