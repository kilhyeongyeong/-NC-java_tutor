package day09;

public class GarbageCollertorTestMain {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			GarbageCollertorTest test = new GarbageCollertorTest(i);
			test = null;
			
			// 쓰레기 수집 강제 실행 명령어(쓸 필요 없음) 
			// 전체적으로 할 경우 비효율적... 나눠서 삭제가 진행되고 보이는데로 삭제가 되므로 나중에 생성된거 먼저 삭제될 수도 있고, 둘 다 삭제가 안 될 가능성도 있음.
			System.gc();
		}

	}

}
