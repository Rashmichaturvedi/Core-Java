import  java.util.regex.*;
import java.util.Scanner;

public class RegexFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 while(true){
	 System.out.println("Enter  regex pattern");
	 Pattern pattern =  Pattern.compile(sc.nextLine());
	 System.out.println("Enter text ");
	 Matcher matcher =pattern.matcher(sc.nextLine());
	 boolean found = false;
	 while(matcher.find()){
		 System.out.println("I Found Text"+matcher.group()+"Starting"
		 		+ matcher.start()+"and ending at index"+matcher.end());
		 found =true;
		 
	 }
	 if(!found){
		 System.out.println("No   Match Found");
		 
	 }
	 
	 
 }
	}

}
