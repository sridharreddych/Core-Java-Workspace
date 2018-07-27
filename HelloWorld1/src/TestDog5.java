class Animal5{

   public void move(){
      System.out.println("Animals can move");
   }
}

class Dogg extends Animal5{

   public void move(){
      super.move(); // invokes the super class method
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog5{

   public static void main(String args[]){

      Animal5 b = new Dogg(); // Animal reference but Dog object
      b.move(); //Runs the method in Dog class

   }
}
