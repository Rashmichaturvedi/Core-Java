import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class PaintingExample extends Applet implements 	MouseMotionListener {
     public void init(){
    	 addMouseMotionListener(this);
    	 setBackground(Color.GRAY);
    	 
     }
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g=getGraphics();
		g.setColor(Color.white);
		g.fillOval(40,40,5,5);
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
