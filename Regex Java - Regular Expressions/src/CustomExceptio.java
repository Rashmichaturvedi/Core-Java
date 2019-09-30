
 class InvalidAge extends Exception{
	 InvalidAgeException(String s){
		 super(s);
	 }
 }
 class CustomExceptio {
	 static void Validate(int age)throws InvalidAgeException{
		 if(age<18)
			 throw new InvalidAgeException("not valid");
		 else
			 System.out.println("Welcome to vote");
	 }


	public static void main(String[] args) {
		try{
			Validate(13);
		}
		catch(Exception m){
			System.out.println("Exception "+ m);
		}
		// TODO Auto-generated method stub
System.out.println("restof code");
	}

}
