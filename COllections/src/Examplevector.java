import java.util.*;
public class Examplevector {
	
	public static void main(String[]  args){
		Vector<String> v =new Vector<String>();
		v.add("Ayush");
		v.add("amit");
		v.add("Garima");
		Iterator<String> itr =v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
