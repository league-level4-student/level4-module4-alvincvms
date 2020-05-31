package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    Random r = new Random();
    
    ArrayList<Polymorph> polymorphs;
    
    private JFrame window;
    private Timer timer;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 this.addMouseListener(this);
   	 this.addMouseMotionListener(this);
   	 
   	 polymorphs = new ArrayList<Polymorph>();
   	 for(int i = 0; i < 15; i++) {
   		 int a = r.nextInt(7);
   		 if(a == 0) {
   			 polymorphs.add(new RedPolymorph(r.nextInt(450), r.nextInt(450)));
   		 }
   		 if(a == 1) {
   			polymorphs.add(new BluePolymorph(r.nextInt(450), r.nextInt(450)));
   		 }
   		 if(a == 2) {
   			polymorphs.add(new MovingPolymorph(r.nextInt(450), r.nextInt(450)));
   		 }
   		 if(a == 3) {
   			polymorphs.add(new ImagePolymorph(r.nextInt(450), r.nextInt(450)));
   		 }
   		 if(a == 4) {
   			polymorphs.add(new SpeakingPolymorph(r.nextInt(450), r.nextInt(450)));
   		 }
   		 if(a == 5) {
   			polymorphs.add(new FollowingPolymorph(r.nextInt(450), r.nextInt(450)));
   		 }
   		 if(a == 6) {
   			polymorphs.add(new CircularPolymorph(r.nextInt(450), r.nextInt(450)));
   		 }
   	 }

   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(Polymorph p : polymorphs) {
   		 p.draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	   	 repaint();
	   	 for(Polymorph p : polymorphs) {
	   		 p.update();
	   		 if(p instanceof FollowingPolymorph) {
	   			 try {
	   			 ((FollowingPolymorph) p).setVel(this.getMousePosition().getX(), this.getMousePosition().getY());
	   			 } catch(NullPointerException n) {
	   				 
	   			 }
	   		 }
	  	 }
	   	
     }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(Polymorph p : polymorphs) {
			if(p instanceof SpeakingPolymorph) {
				if(e.getX() >= p.getX() && e.getX() < p.getX() + p.getWidth() && e.getY() >= p.getY() && e.getY() < p.getY() + p.getWidth()) {
					JOptionPane.showMessageDialog(null, "oof!");
				}
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		for(Polymorph p : polymorphs) {
			if(p instanceof SpeakingPolymorph) {
				if(e.getX() >= p.getX() && e.getX() < p.getX() + p.getWidth() && e.getY() >= p.getY() && e.getY() < p.getY() + p.getWidth()) {
					((SpeakingPolymorph) p).mouseEntered = true;
				}
				else {
					((SpeakingPolymorph) p).mouseEntered = false;
				}
			}
		}
	}
}
