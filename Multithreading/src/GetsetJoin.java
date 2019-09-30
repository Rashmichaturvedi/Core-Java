
public class GetsetJoin extends Thread {
	public void run(){
		System.out.println("running");
	}
	public static void main(String[] args){
		GetsetJoin g1= new GetsetJoin();
		GetsetJoin g2 = new GetsetJoin();
		System.out.println("Name of t1"+g1.getName());
		System.out.println("Name of t2"+g2.getName());
		System.out.println("id is "+g1.getId());
		g1.start();
		g2.start();g1.setName("Rashmi");
		System.out.println("After changing "+g1.getName());
		
	}

}
