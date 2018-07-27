class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   RunnableDemo( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
   public void run() {
      System.out.println("Running in run method " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
     }
     System.out.println("Thread ending in run method" +  threadName + " exiting.");
   }
   
   public void start ()
   {
      System.out.println("Starting in start method1" +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         System.out.println("Starting in start method2" +  threadName );
         t.start ();
         System.out.println("ending in start method2" +  threadName );
      }
   }

}

public class TestThread {
   public static void main(String args[]) {
   
      RunnableDemo R1 = new RunnableDemo( "Thread-1");
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo( "Thread-2");
      R2.start();
   }   
}