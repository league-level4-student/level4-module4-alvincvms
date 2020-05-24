package _03_polymorphs;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph{

	BufferedImage polymorph;
	
	ImagePolymorph(int x, int y) {
		super(x, y);
		setWidth(70);
		setHeight(100);
		try {
			polymorph = ImageIO.read(new File("C:/Users/alvin/Desktop/Alvin/Stuffs/Polymorph.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(polymorph, getX(), getY(), getWidth(), getHeight(), null);
	}
	
	public void update() {
		super.update();
	}
}
