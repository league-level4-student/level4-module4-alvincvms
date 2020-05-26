package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class SpeakingPolymorph extends Polymorph{

	private Color c;
	boolean mouseEntered = false;
	
	SpeakingPolymorph(int x, int y) {
		super(x, y);
		c = new Color(0, 255, 0);
		setWidth(50);
		setHeight(50);
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(c);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		super.update();
		if(mouseEntered) {
			c = new Color(100, 255, 100);
		}
		else {
			c = new Color(0, 255, 0);
		}
	}
}
