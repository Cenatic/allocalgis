/**
 * EncodeUtil.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.localgis.web.util;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class EncodeUtil {

	public static String encodeURl(String originalURL) throws UnsupportedEncodingException

    {
 
        String mapaEncode = originalURL.replaceAll(" ", "%20");

        String encoding = "ISO8859-1";

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

 

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

        mapaEncode = mapaEncode.replaceAll("�", URLEncoder.encode("�",encoding));

 

        return mapaEncode;

    }


}

