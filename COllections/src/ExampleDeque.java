import java.util.*;
public class ExampleDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String> deque =new ArrayDeque<String>();
deque.add("Gautam");
deque.add("karan");
deque.add("harsh");
for(String str :deque){
	System.out.println(str);}
	ArrayList<String> al2=new ArrayList<String>();
	al2.add("Ravi");
	al2.add("vijay");
	deque.retainAll(al2);
	System.out.println("deque is"+deque );
	System.out.println("array is"+al2);
}
	}


