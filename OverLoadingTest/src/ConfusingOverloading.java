import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ConfusingOverloading{
  
    public boolean hasDuplicates(List collection){
        System.out.println("overloaded method with Type List ");
        return true;
    }
  
    public boolean hasDuplicates(ArrayList collection){
        System.out.println("overloaded method with Type ArrayList ");
        return true;
    }
  
  
    public boolean hasDuplicates(LinkedList collection){
        System.out.println("overloaded method with Type LinkedList ");
        return true;
    }
  
}
