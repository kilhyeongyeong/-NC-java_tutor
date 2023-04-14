package day07;

public class HumanMain {

	public static void main(String[] args) {
		// 타 클래스에 정의된 요소를 main 내부에서 생성해 쓸 수 있습니다.
		
		// new 키워드는 힙에 자료를 저장합니다.
		// 자료형 변수 = new 자료형();
		// 위 명령어로 구조체의 인스턴스를 생성할 수 있습니다.
		
		// 사람 1 생성
		Human h1 = new Human();
		
		h1.name = "하이잉";
		h1.age = 22;
		h1.height = 161;
		
		System.out.println("사람 1의 이름 : " + h1.name);
		
		// 사람 2 생성
		Human h2 = new Human();
		h2.name = "오왕";
		h2.age = 18;
		h2.height = 158;
		
		System.out.println("사람 2의 키 : " + h2.height);
		
	}

}
