class Animal4{

   public void move(){
      System.out.println("Animals can move");
   }

public void bark() {
	// TODO Auto-generated method stub
	
}
}

class Dog4 extends Animal4{

   public void move(){
      System.out.println("Dogs can walk and run");
   }
   public void bark(){
      System.out.println("Dogs can bark");
   }
}

public class TestDog1{

   public static void main(String args[]){
      Animal4 a = new Animal4(); // Animal reference and object
      Animal4 b = new Dog4(); // Animal reference but Dog object

      a.move();// runs the method in Animal class
      b.move();//Runs the method in Dog class
      b.bark();
   }
}
