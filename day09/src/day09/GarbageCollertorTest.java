package day09;

public class GarbageCollertorTest {
	public int objectNum; // 객체 번호

	// 생성자(객체가 힘에서 생성되기 직전에 메서드)
	public GarbageCollertorTest(int number) {
		objectNum = number;
		System.out.println(objectNum);
	}
	
	// 소멸자(객체가 힙에서 삭제되기 직전에 실행되는 메서드)
	// 있고 없고의 차이점 : 오버라이드 메서드를 잘못 기입했을 경우 새로운 메서드로 인식하는지 하지 않는지 차이(잘못기입하면 컴파일러가 체크해줘서 빨간줄 뜸)
	@Override 
	protected void finalize() throws Throwable{
		System.out.println(objectNum + "번 객체가 힙에서 삭제됩니다.");
	}

}
