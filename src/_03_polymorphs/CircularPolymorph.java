package _03_polymorphs;

import java.awt.Graphics;

public class CircularPolymorph extends Polymorph{

	CircularPolymorph(int x, int y) {
		super(x, y);
		setWidth(50);
		setHeight(50);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
	public void update() {
		super.update();
	}
}
