
public class LearnSleep extends Thread{
	public void run(){
		for(int i=1;i<5;i++){
			try {
				Thread.sleep(500);}
			
		
			catch(InterruptedException e){
				System.out.println(e);
		}
			System.out.println(i);
	} }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnSleep t1= new LearnSleep();
		LearnSleep t2 =new LearnSleep();
		t1.start();
		t1.run();
	}

}
