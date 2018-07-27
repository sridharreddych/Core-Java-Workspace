import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
  * Java program to demonstrate how to remove object form List and differnece
  * between Iterator's remove() method and Colection's remove() method in Java
  *
  * @author http://javarevisited.blogspot.com
 */
public class ObjectRemovalTest {
  
    public static void main(String args[]) {
      
       List markets = new ArrayList();
     
       StockExchange TSE = new StockExchange(){
         
            @Override
            public boolean isClosed() {
                return true;
            }         
       };
     
       StockExchange HKSE = new StockExchange(){

            @Override
            public boolean isClosed() {
                return true;
            }         
       };
      
       StockExchange NYSE = new StockExchange(){

            @Override
            public boolean isClosed() {
                return false;
            }         
       };
      
       markets.add(TSE);
       markets.add(HKSE);
       markets.add(NYSE);
     
     
      // Iterator itr = markets.iterator();
     
      /* while(itr.hasNext()){
           StockExchange exchange = (StockExchange) itr.next();
           if(exchange.isClosed()){
//               markets.remove(exchange); //Use itr.remove() method
               itr.remove();
               System.out.println(" Iterating over HashSet in Java current object: " + itr.next());
               System.out.println(" Iterating over HashSet in Java current object: " + exchange);
           }
           
//            System.out.println(" Iterating over HashSet in Java current object: " +((Iterator) exchange).next());
       }*/
       
       
       for(Iterator<String> itr = markets.iterator(); itr.hasNext();){            
//           Mark phone = itr.next();
    	   StockExchange exchange = (StockExchange)itr.next();
           if(phone.startsWith("iPhone")){
               // listOfPhones.remove(phone);  // wrong again
               itr.remove(); // right call
           }
       }
       
       
       for(Iterator<String> itr = listOfPhones.iterator(); itr.hasNext();){            
           String phone = itr.next();            
           if(phone.startsWith("iPhone")){
               // listOfPhones.remove(phone);  // wrong again
               itr.remove(); // right call
           }
       }
       
       System.out.println("list after removal: " + listOfPhones);
       
     
    }    
  
}

interface StockExchange{
    public boolean isClosed();
}
