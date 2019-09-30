
public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    A obj = new A();
    obj.start();
    
    
    new Thread{() ->
    {
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("hiie");
    		try{
    			Thread.sleep(1000);
    			}
    		catch(InterruptedException ex){}
    		
    	}
    }
    
	).start();
	
}
}
class A  extends Thread
{
	 public void run(){
		System.out.println("helo");
	}
}