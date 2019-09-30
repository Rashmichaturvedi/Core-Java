
public class LocalInner {
private  int  data=30;
void display(){
	class Local{
		void msg(){
			System.out.println("data is "+data);
		}
	}
	Local l = new Local();
	l.msg();
}
public static void main(String [] args){
	LocalInner obj = new LocalInner();
	obj.display();
	
}
}
