import java.awt.*;
import java.applet.*;

public class ImageDisplay extends Applet {
	Image picture;
	public void init(){
		picture=getImage(getDocumentBase(),"web_.png");
		
	}
	public void paint(Graphics g){
		g.drawImage(picture, 50,50,this);
		
	}

}
