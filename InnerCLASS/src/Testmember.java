
public class Testmember {
	private int data=30;
	class Inner{
		void msg(){
			System.out.println("data is "+data);
			
		}
	}
 public static void main(String[] args){
	 Testmember obj = new Testmember();
	 Testmember.Inner in =obj.new Inner();
	 in.msg();
	 
 }
}
