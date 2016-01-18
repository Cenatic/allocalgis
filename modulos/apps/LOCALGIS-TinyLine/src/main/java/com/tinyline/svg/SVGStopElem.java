/**
 * SVGStopElem.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.tinyline.svg;

import com.tinyline.tiny2d.TinyNumber;
import com.tinyline.tiny2d.TinyRect;

// Referenced classes of package com.tinyline.svg:
//            SVGNode, SVGRaster

public class SVGStopElem extends SVGNode
{

    int v;

    SVGStopElem()
    {
        v = 0;
    }

    public SVGStopElem(SVGStopElem svgstopelem)
    {
        super(svgstopelem);
        v = svgstopelem.v;
    }

    public SVGNode copyNode()
    {
        return new SVGStopElem(this);
    }

    public int setAttribute(int i, Object obj)
        throws Exception
    {
        super.outlined = false;
        if(super.parent != null)
        {
            super.parent.outlined = false;
        }
        switch(i)
        {
        case 55: // '7'
            v = ((TinyNumber)obj).val;
            break;

        default:
            return super.setAttribute(i, obj);
        }
        return 0;
    }

    public Object getAttribute(int i)
    {
        int j = 0;
        Object obj = null;
        switch(i)
        {
        case 55: // '7'
            j = v;
            break;

        default:
            return super.getAttribute(i);
        }
        if(obj != null)
        {
            return obj;
        } else
        {
            return new TinyNumber(j);
        }
    }

    public void paint(SVGRaster svgraster)
    {
    }

    public int createOutline()
    {
        return 0;
    }

    public TinyRect getDevBounds(SVGRaster svgraster)
    {
        TinyRect tinyrect = new TinyRect();
        if(super.parent != null)
        {
            return super.parent.getDevBounds(svgraster);
        } else
        {
            return tinyrect;
        }
    }

	public void copyGeometryTo(SVGNode destNode) {
	}
}
