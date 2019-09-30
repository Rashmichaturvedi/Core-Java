
public class Testjoin  extends Thread{
public 	void run(){
		for(int i=1;i<5;i++){
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				
			
		
		System.out.println(e);
		
	}
			System.out.println(i);
		}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testjoin t1 = new Testjoin();
		Testjoin T2= new Testjoin();
		Testjoin T3= new Testjoin();
		t1.start();
		try {
		t1.join(3000);
		} catch(Exception e){
			System.out.println(e);
		} T2.start();  T3.start();
	}

}
