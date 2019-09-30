import java.util.*;
 class ExampleMap {
	public  static void main(String []rgs){
		Map<Integer,String>map=new HashMap<Integer,String>();
	map.put(100,"rashmi");
	map.put(101,"ajay");
	map.put(102,"raj");
	map.entrySet();
	.stream()
	.sorted(Map.Entry.comparingByKey())
	.forEach(System.out::println);
	
	for(Map.Entry m :map.entrySet()){
		System.out.println(m.getKey()+" = "+m.getValue());
		
	}
	}

}
