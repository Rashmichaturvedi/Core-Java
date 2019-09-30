
public class Learn {
	void run(){
		System.out.println("running");
	}
}
class Honda extends Learn{
	int speedlimit =150;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Learn L = new Honda();
 L.run();

	}

}
