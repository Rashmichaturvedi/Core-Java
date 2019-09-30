import java.awt.*;
import java.awt.event.*;
public class TextAreaExample extends Frame implements ActionListener{
Label l1,l2;
TextArea area;
Button b;
TextAreaExample(){
l1= new Label();
l1.setBounds(50,100,250,20);
l2=new Label();
l2.setBounds(50,160,230,10);
b=new Button("count words");
b.setBounds(100,400,200,30);
b.addActionListener(this);
area= new TextArea();
area.setBounds(180,200,400,30);
add(l1);add(l2); add(area); add(b);
setSize(400,300);
setLayout(null);
setVisible(true);


}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text=area.getText();
		String words[]=text.split("\\s");
		l1.setText("words"+words.length);
		l2.setText("characters" +text.length());
		
		
	}


public static  void main(String[] args){
new TextAreaExample();
}
}