
import java.io.*;

public class StringReplaceAll{
   public static void main(String args[]){
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.replaceAll("Tutorials",
                         "Sridhar" ));
      System.out.println(Str.replaceAll("(.*)Tutorials(.*)",
              "AMROOD" ));
   }
}
