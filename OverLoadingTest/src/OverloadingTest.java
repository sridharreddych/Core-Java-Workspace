import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Java program to demonstrate some best practice to following while overloading
 * method in Java.This Java program shows a case of confusing method overloading in Java
 *
 * @author Javin Paul
 */
public class OverloadingTest {
  
    public static void main(String args[]){
       List abc = new ArrayList();
       List bcd = new LinkedList();
      
       ConfusingOverloading co = new ConfusingOverloading();
       co.hasDuplicastes(abc); //should call to ArryList overloaded method
       co.hasDuplicates(bcd); //should call to LinkedList overloaded method
    }

  
}
