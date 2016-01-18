/**
 * ImageBorder.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * 
 */
package com.gestorfip.app.planeamiento.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;

import javax.swing.border.AbstractBorder;

/**
 * @author javieraragon
 *
 */
public class ImageBorder extends AbstractBorder {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6962405798844086915L;

	Image topCenterImage, topLeftImage, topRight;

	Image leftCenterImage, rightCenterImage;

	Image bottomCenterImage, bottomLeftImage, bottomRightImage;

	Insets insets;

	public ImageBorder(Image top_left, Image top_center, Image top_right, Image left_center,
			Image right_center, Image bottom_left, Image bottom_center, Image bottom_right) {

		this.topLeftImage = top_left;
		this.topCenterImage = top_center;
		this.topRight = top_right;
		this.leftCenterImage = left_center;
		this.rightCenterImage = right_center;
		this.bottomLeftImage = bottom_left;
		this.bottomCenterImage = bottom_center;
		this.bottomRightImage = bottom_right;
	}

	public void setInsets(Insets insets) {
		this.insets = insets;
	}

	public Insets getBorderInsets(Component c) {
		if (insets != null) {
			return insets;
		} else {
			return new Insets(topCenterImage.getHeight(null), leftCenterImage.getWidth(null), bottomCenterImage
					.getHeight(null), rightCenterImage.getWidth(null));
		}
	}

	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);

		Graphics2D g2 = (Graphics2D) g;

		int tlw = topLeftImage.getWidth(null);
		int tlh = topLeftImage.getHeight(null);
//		int tcw = topCenterImage.getWidth(null);
		int tch = topCenterImage.getHeight(null);
		int trw = topRight.getWidth(null);
		int trh = topRight.getHeight(null);

		int lcw = leftCenterImage.getWidth(null);
//		int lch = leftCenterImage.getHeight(null);
		int rcw = rightCenterImage.getWidth(null);
//		int rch = rightCenterImage.getHeight(null);

		int blw = bottomLeftImage.getWidth(null);
		int blh = bottomLeftImage.getHeight(null);
//		int bcw = bottomCenterImage.getWidth(null);
		int bch = bottomCenterImage.getHeight(null);
		int brw = bottomRightImage.getWidth(null);
		int brh = bottomRightImage.getHeight(null);

		fillTexture(g2, topLeftImage, x, y, tlw, tlh);
		fillTexture(g2, topCenterImage, x + tlw, y, width - tlw - trw, tch);
		fillTexture(g2, topRight, x + width - trw, y, trw, trh);

		fillTexture(g2, leftCenterImage, x, y + tlh, lcw, height - tlh - blh);
		fillTexture(g2, rightCenterImage, x + width - rcw, y + trh, rcw, height - trh - brh);

		fillTexture(g2, bottomLeftImage, x, y + height - blh, blw, blh);
		fillTexture(g2, bottomCenterImage, x + blw, y + height - bch, width - blw - brw, bch);
		fillTexture(g2, bottomRightImage, x + width - brw, y + height - brh, brw, brh);
	}

	public void fillTexture(Graphics2D g2, Image img, int x, int y, int w, int h) {
		BufferedImage buff = createBufferedImage(img);
		Rectangle anchor = new Rectangle(x, y, img.getWidth(null), img.getHeight(null));
		TexturePaint paint = new TexturePaint(buff, anchor);
		g2.setPaint(paint);
		g2.fillRect(x, y, w, h);
	}

	public BufferedImage createBufferedImage(Image img) {
		BufferedImage buff = new BufferedImage(img.getWidth(null), img.getHeight(null),
				BufferedImage.TYPE_INT_ARGB);
		Graphics gfx = buff.createGraphics();
		gfx.drawImage(img, 0, 0, null);
		gfx.dispose();
		return buff;
	}

}
