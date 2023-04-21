package example.thread2;

public class AlarmMachine implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<500; i++) {
				System.out.println("경고음 삐삐");
				Thread.sleep(2000);
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
