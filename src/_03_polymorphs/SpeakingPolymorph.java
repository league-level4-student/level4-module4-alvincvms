package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class SpeakingPolymorph extends Polymorph implements MouseListener{

	Color c;
	boolean mouseEntered;
	
	SpeakingPolymorph(int x, int y) {
		super(x, y);
		c = Color.green;
		mouseEntered = false;
		setWidth(50);
		setHeight(50);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(0, 255, 0));
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		super.update();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(mouseEntered) {
			JOptionPane.showMessageDialog(null, "oof!");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		c = new Color(50, 255, 50);
		mouseEntered = true;
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		c = new Color(0, 255, 0);
		mouseEntered = false;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
