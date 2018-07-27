import java.io.*;

public class DataInput_Stream1{

   public static void main(String args[])throws IOException{
      
      //writing string to a file encoded as modified UTF-8 
      DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("F:\\file1.txt"));
      dataOut.writeUTF("hello");      
      
      //Reading data from the same file
      DataInputStream dataIn = new DataInputStream(new FileInputStream("F:\\file1.txt"));       
      
      while(dataIn.available()>0){
      
         String k = dataIn.readUTF();
         System.out.print(k+" ");
      }
      
   }

}