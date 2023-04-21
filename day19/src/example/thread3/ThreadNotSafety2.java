package example.thread3;

public class ThreadNotSafety2 extends Thread {
    
    static int share;
    
    public static void main(String[] args) {
      ThreadNotSafety2 t1 = new ThreadNotSafety2();
      ThreadNotSafety2 t2 = new ThreadNotSafety2();
      
      t1.start();
      t2.start();
    }
    
    public void run() {
      for(int count = 0; count < 10000; count++){
        System.out.println(share++); 
        
//        try { sleep(50); }
//        catch (InterruptedException e) {}
      }
    }
}