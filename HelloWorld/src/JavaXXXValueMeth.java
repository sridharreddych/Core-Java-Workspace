public class JavaXXXValueMeth{ 

   public static void main(String args[]){
      Integer x = 5;
      Integer y = 10;
      Integer z =5;
      Short a = 5;
      
      // Returns byte primitive data type
      System.out.println( x.byteValue() );

      // Returns double primitive data type
      System.out.println(x.doubleValue());

      // Returns long primitive data type
      System.out.println( x.longValue() );    
      System.out.println(x.compareTo(3));
      System.out.println(x.compareTo(5));
      System.out.println(x.compareTo(8));  
      



      System.out.println(x.equals(y));  
      System.out.println(x.equals(z)); 
      System.out.println(x.equals(a));
      
      
       x =Integer.valueOf(9);
      Double c = Double.valueOf(5);
      Float f = Float.valueOf("80");               

      Integer b = Integer.valueOf("444",16);

      System.out.println(x); 
      System.out.println(c);
      System.out.println(f);
      System.out.println(b);
      
x=5;
      System.out.println(x.toString());  
      System.out.println(Integer.toString(12)); 

      int pi =Integer.parseInt("9");
     c = Double.parseDouble("5");
      int b1 = Integer.parseInt("444",16);

      System.out.println(pi);
      System.out.println(c);
      System.out.println(b1);

      a = -8;
      double d = -100;
      float f1 = -90;    
						
      System.out.println(Math.abs(a));
      System.out.println(Math.abs(d));     
      System.out.println(Math.abs(f1));    

      double d2 = -100.675;
      float f2 = -90;    

      System.out.println(Math.ceil(d2));
      System.out.println(Math.ceil(f2)); 
					 
      System.out.println(Math.floor(d2));
      System.out.println(Math.floor(f2)); 
      
      double d3 = 100.675;
      double e3 = 100.500;
      double f3 = 100.200;

      System.out.println(Math.rint(d3));
      System.out.println(Math.rint(e3)); 
      System.out.println(Math.rint(f3)); 
      
      double d4 = 100.675;
      double e4 = 100.500;
      float f4 = 100;
      float g4 = 90f;

      System.out.println(Math.round(d4));
      System.out.println(Math.round(e4)); 
      System.out.println(Math.round(f4)); 
      System.out.println(Math.round(g4)); 

      System.out.println(Math.min(12.123, 12.456));      
      System.out.println(Math.min(23.12, 23.0));  

      System.out.println(Math.max(12.123, 12.456));      
      System.out.println(Math.max(23.12, 23.0));  
    
      double x2 = 11.635;
      double y2 = 2.76;

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("exp(%.3f) is %.3f%n", x2, Math.exp(x2));  
      
      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("log(%.3f) is %.3f%n", x2, Math.log(x2));

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("pow(%.3f, %.3f) is %.3f%n", x2, y2, Math.pow(x2, y2));

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("sqrt(%.3f) is %.3f%n", x2, Math.sqrt(x2));

      
      double degrees = 45.0;
      double radians = Math.toRadians(degrees);

      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The sine of %.1f degrees is %.4f%n", degrees, Math.sin(radians));

      
      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The cosine of %.1f degrees is %.4f%n", degrees, Math.cos(radians));
      
      
      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The tangent of %.1f degrees is %.4f%n", degrees, Math.tan(radians));

      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The arcsine of %.4f is %.4f degrees %n", Math.sin(radians), Math.toDegrees(Math.asin(Math.sin(radians))));
      
      
      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The arccosine of %.4f is %.4f degrees %n", Math.cos(radians), Math.toDegrees(Math.acos(Math.sin(radians))));
      
      
      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The arctangent of %.4f is %.4f degrees %n", Math.cos(radians), Math.toDegrees(Math.atan(Math.sin(radians))));
      
      
      double x4 = 45.0;
      double y4 = 30.0;

      System.out.println( Math.atan2(x4, y4) );
      
      double x5 = 45.0;
      double y5 = 30.0;

      System.out.println( Math.toDegrees(x5) );
      System.out.println( Math.toDegrees(y5) );


      System.out.println( Math.toRadians(x5) );
      System.out.println( Math.toRadians(y5) );

      System.out.println( Math.random() );
      System.out.println( Math.random() );

      
      
      
      
   }
}
