package day04;

public class WhileExample {

	public static void main(String[] args) {
		// while 반보문 로직 파악을 위한 예시
		
		int count = 0; // 더 진행할지 말지 결정할 변수
		while(count < 3) {
			count++;
			System.out.println("while이 실행중입니다. " + count);
		}
		
	}

}
