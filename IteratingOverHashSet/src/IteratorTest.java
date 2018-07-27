import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * Java program to Iterate, loop or traverse over HashSet in Java
 * This technique can be used to traverse over any other Collection as well
 * e.g. traversing over ArrayList or traversing over LinkedList in Java
 * @author
 */
public class IteratorTest {

  
    public static void main(String args[]) {
      
        //creating HashSet to iterate over
        Set<String> streams = new HashSet<String>();
        streams.add("Programming");
        streams.add("Development");
        streams.add("Debugging");
        streams.add("Coding");
      
        // Iterating over HashSet in Java using for-each loop
        for(String str : streams){
            System.out.println(" Looping over HashSet in Java element : " + str);
        }
      
        //Iterating over HashSet using Iterator in Java
        Iterator<String> itr = streams.iterator();
        while(itr.hasNext()){
            System.out.println(" Iterating over HashSet in Java current object: " + itr.next());
        }
      
    }
}
