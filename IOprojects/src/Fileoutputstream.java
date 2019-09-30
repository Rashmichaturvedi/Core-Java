import java.io.FileOutputStream;

public class Fileoutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	FileOutputStream fout=new FileOutputStream("F:\\testout.txt");
	String s= "WELCOME ";
	byte b[]=s.getBytes();
	fout.write(b);
	fout.close();
	System.out.println("Success");
	
}catch(Exception e){System.out.println(e);}

	}

}
