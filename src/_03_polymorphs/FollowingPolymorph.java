package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class FollowingPolymorph extends Polymorph{
	
	private int xV;
	private int yV;
	
	FollowingPolymorph(int x, int y) {
		super(x, y);
		setWidth(50);
		setHeight(50);
		xV = 0;
		yV = 0;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.cyan);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		super.update();
		setX(getX() + xV);
		setY(getY() + yV);
	}
	
	public void setVel(double mouseX, double mouseY) {
		xV = (int) (mouseX - getX() - getWidth()/2)/8;
		yV = (int) (mouseY - getY() - getHeight()/2)/8;
	}
	
	public void setxV(int v) {
		
	}
	
	public int getxV() {
		return	xV;
	}
	
	public void setyV(int v) {
		
	}
	
	public int getyV() {
		return yV;
	}
}
