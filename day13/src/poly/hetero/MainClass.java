package poly.hetero;

public class MainClass {

	public static void main(String[] args) {
		// 기본형 자료형...
		
		// A자료형의 힙 주소를 배열로 저장 가능한
		A[] aArr = new A[2];
		
		A a1 = new A();
		A a2 = new A();
		
		aArr[0] = a1;
		aArr[1] = a2;
		
		Object[] oArr = new Object[2];
		
		B b1 = new B();
//		aArr[1] = b1;
		oArr[0] = b1;
		oArr[1] = a2;
		
		oArr[1] = 10; // 기본형 자료도 대입 가능

	}

}
