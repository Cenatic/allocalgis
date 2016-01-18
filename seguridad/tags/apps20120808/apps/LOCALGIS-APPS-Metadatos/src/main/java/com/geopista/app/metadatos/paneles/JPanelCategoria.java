package com.geopista.app.metadatos.paneles;


import com.geopista.app.metadatos.estructuras.Estructuras;
import com.geopista.app.metadatos.componentes.PanelCheckBoxEstructurasCondicional;

import java.util.ResourceBundle;

/**
 * The GEOPISTA project is a set of tools and applications to manage
 * geographical data for local administrations.
 *
 * Copyright (C) 2004 INZAMAC-SATEC UTE
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
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307,
 USA.
 *
 * For more information, contact:
 *
 *
 * www.geopista.com
 *
 *
 */


/**
 * Created by IntelliJ IDEA.
 * User: angeles
 * Date: 30-jul-2004
 * Time: 12:10:37
 */
public class JPanelCategoria extends PanelCheckBoxEstructurasCondicional {
    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(JPanelCategoria.class);
    public JPanelCategoria(ResourceBundle messages) {
        super(Estructuras.getListaTopicCategory(),10,2);
        logger.debug("ALTISIMO: "+this.getPreferredSize().getHeight());
        logger.debug("ANCHISIMO: "+this.getPreferredSize().getWidth());

    }
    public void changeScreenLang()
    {

    }

}
