class Animal2{

   public void move(){
      System.out.println("Animals can move");
   }
}

class Dog2 extends Animal2{

   public void move(){
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog{

   public static void main(String args[]){
      Animal2 a = new Animal2(); // Animal reference and object
      Animal2 b = new Dog2(); // Animal reference but Dog object

      a.move();// runs the method in Animal class

      b.move();//Runs the method in Dog class
   }
}
