package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Random;

public class CircularPolymorph extends Polymorph{

	int angle;
	float x;
	float y;
	float oX;
	float oY;
	double speed;
	
	int r;
	int g;
	int b;
	Color c;
	
	CircularPolymorph(int x, int y) {
		super(x, y);
		setWidth(50);
		setHeight(50);
		oX = x;
		oY = y;
		angle = new Random().nextInt(360);
		c = new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256));
		r = new Random().nextInt(3) + 1;
		g = new Random().nextInt(3) + 1;
		b = new Random().nextInt(3) + 1;
		System.out.println(oX + ", " + oY);
		speed = .3f;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
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
		c = new Color(c.getRed() + r, c.getGreen() + g, c.getBlue() + b);
		if(angle + 1 >= 360) {
			angle = 0;
		}
		else {
			angle++;
		}
		x = (float) (oX + Math.cos(speed * angle) * 50);
		y = (float) (oY + Math.sin(speed * angle) * 50);
		setX((int) this.x);
		setY((int) this.y);
	}
}
