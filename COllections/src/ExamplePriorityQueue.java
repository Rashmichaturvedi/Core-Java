import java.util.*;
public class ExamplePriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   PriorityQueue<String>queue=new PriorityQueue<String>();
   queue.add("amit"); queue.add("raj singh");
   queue.add("jai");
   System.out.println("head :"+queue.element());
   System.out.println("head :"+queue.peek());
   Iterator itr=queue.iterator();
   while(itr.hasNext()){
	   System.out.println(itr.next());
	   
   }queue.remove();
   queue.poll();
   System.out.println("after removing");
   
   Iterator itr2=queue.iterator();
   while(itr2.hasNext()){
	   System.out.println(itr2.next());
	   
   }
	}

}
