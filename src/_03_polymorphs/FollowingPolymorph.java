package _03_polymorphs;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class FollowingPolymorph extends Polymorph{
	
	FollowingPolymorph(int x, int y) {
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
