
public interface Eatable {
	void eat();
	class TestAnony {
		public static void main(String[] args){
			Eatable e = new Eatable(){
				public void eat(){
					System.out.println("Niice fruits");
					
				}
			
		};
		e.eat();
	}

}}
