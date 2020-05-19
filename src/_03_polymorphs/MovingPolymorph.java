package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingPolymorph extends Polymorph{
	int r;
	int g;
	int b;
	int xV;
	int yV;
	Color c;
	
	public MovingPolymorph(int x, int y) {
		super(x, y);
		c = new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256));
		r = new Random().nextInt(3) + 1;
		g = new Random().nextInt(3) + 1;
		b = new Random().nextInt(3) + 1;
		xV = 1;
		yV = 1;
		setWidth(50);
		setHeight(50);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		super.update();
		if((c.getRed() + r >= 255) || (c.getRed() + r <= 0)) {
			r = -r;
		}
		if((c.getGreen() + g >= 255) || (c.getGreen() + g <= 0)) {
			g = -g;
		}
		if((c.getBlue() + b >= 255) || (c.getBlue() + b <= 0)) {
			b = -b;
		}
		if((getX() >= 500 - getWidth()) || (getX() <= 0)) {
			xV = -xV;
		}
		if((getY() >= 500 - getHeight()) || (getY() <= 0)) {
			yV = -yV; 
		}
		c = new Color(c.getRed() + r, c.getGreen() + g, c.getBlue() + b);
		setX(getX() + xV);
		setY(getY() + yV);
	}
}
