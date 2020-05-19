package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
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
   	 
   	 polymorphs = new ArrayList<Polymorph>();
   	 for(int i = 0; i < 10; i++) {
   		 int a = r.nextInt(5);
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
  	 }
    }
}
