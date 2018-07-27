import java.io.*;

public class StringLastIndexOf {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");
      String SubStr1 = new String("Tutorials" );
      String SubStr2 = new String("Sutorials" );

      System.out.print("Found Last Index :" );
      System.out.println(Str.lastIndexOf( 'o' ));
      System.out.print("Found Last Index :" );
      System.out.println(Str.lastIndexOf( 'l', 2 ));
      System.out.print("Found Last Index :" );
      System.out.println( Str.lastIndexOf( SubStr1 ));
      System.out.print("Found Last Index :" );
      System.out.println( Str.lastIndexOf( SubStr1, 11 ));
      System.out.print("Found Last Index :" );
      System.out.println(Str.lastIndexOf( SubStr2 ));
   }
}
