package example.thread;

// 보조쓰레드에서 실행할 내용을 정의하기 위해서
// 1. Runnale 인터페이스를 구현합니다.
public class MultiThread implements Runnable {
	
	// 2. Runnable 인터페이스의 run() 메서드를 오버라이딩해 실행할 내용을 적습니다.
	@Override
	public void run() {
		// 여태까지 코드는 순차적으로 쉬는시간 없이 실행되었음
		// Tread.stop(초);는 해당 쓰레드 실행을 입력한 초만큼 중단합니다.
		// try-chatch블럭에 반드시 넣어야 함
		try{
			System.out.println("보조쓰레드 : 실행1");
			Thread.sleep(1000);
			System.out.println("보조쓰레드 : 실행2");
			Thread.sleep(1000);
			System.out.println("보조쓰레드 : 실행3");			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
