
public class Dog1 extends Mammal{
   public static void main(String args[]){

      Mammal m = new Mammal();
      Dog1 d = new Dog1();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
   }
} 
