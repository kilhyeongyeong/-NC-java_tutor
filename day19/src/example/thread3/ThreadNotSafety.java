package example.thread3;

public class ThreadNotSafety extends Thread {
    
    static int share;
    
    public static void main(String[] args) {
      ThreadNotSafety t1 = new ThreadNotSafety();
      ThreadNotSafety t2 = new ThreadNotSafety();
      
      t1.start();
      t2.start();
    }
    
    // 쓰레드 안전을 위해서 사용하느 메서드
	public  synchronized  static void sharePlus() {
    	System.out.println(share++);
    }
    
    public void run() {
      for(int count = 0; count < 10; count++){
    	  sharePlus(); // 메서드를 이용해 share 1증가
        
        try { sleep(25); }
        catch (InterruptedException e) {}
      }
    }
}