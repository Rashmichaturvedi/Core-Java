
class Multi implements Runnable{
	public void run(){
		System.out.println("thread is running");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Multi m = new Multi();
         Thread t= new Thread(m);
         t.start();
	}

}
