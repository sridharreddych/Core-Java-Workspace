class s{

	s(){
		try{
			throw new Exception();
		}catch(Exception ex) {
			System.out.println("Do Nothing");
		}
	}
	   
}


class Tester {
	public static void main(String args[]) {
	      String s = "Hi";
	      System.out.println(s);
	      s = "Hello";
	      System.out.println(s);
	   }
}