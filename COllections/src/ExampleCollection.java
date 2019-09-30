import java.util.ArrayList;

import java.util.*;
public class ExampleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list =new ArrayList<String>();
list.add("c");
list.add("core java");
System.out.println("inital"+list);
Collections.addAll(list,"servlet","jsp");
System.out.println("after"+list);
String[]  strArr={"c+","net"};

System.out.println("now"+list);
System.out.println(Collections.max(list));

	}
}
