package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingPolymorph extends Polymorph{
	int r;
	int g;
	int b;
	Color c;
	
	public MovingPolymorph(int x, int y) {
		super(x, y);
		c = new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256));
		r = new Random().nextInt(3) + 1;
		g = new Random().nextInt(3) + 1;
		b = new Random().nextInt(3) + 1;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		super.update();
		if(c.getRed() + r > 255) {
			r = -r;
		}
		if(c.getGreen() + g > 255) {
			g = -g;
		}
		if(c.getBlue() + b > 255) {
			b = -b;
		}
		c = new Color(c.getRed() + r, c.getGreen() + g, c.getBlue() + b);
	}
}
