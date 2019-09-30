import java.awt.*;
public class MenuExample {
MenuExample(){
	Frame f =new Frame("Welcome ");
	MenuBar mb=new MenuBar();
	Menu menu=new Menu("Menu");
	Menu Submenu=new Menu("Submenu");
	MenuItem i1= new MenuItem("new");
	MenuItem i2= new MenuItem("save");
	MenuItem i3=new MenuItem("Open");
	MenuItem i4= new MenuItem("folder 1");
	MenuItem i5= new MenuItem("Folder 2");
	menu.add(i1);
	menu.add(i2);
	menu.add(i3);
	Submenu.add(i4);
	Submenu.add(i5);
	menu.add(Submenu);
	mb.add(menu);
	f.setMenuBar(mb);
	f.setVisible(true);
	f.setSize(400, 300);
	f.setLayout(null);
}
public static void main(String[] args)
{
	new MenuExample();
	
}
}
