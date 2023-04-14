package day03;

public class IfExample {

	public static void main(String[] args) {
		// 0~100까지의 난수를 score 변수에 저장해보세요.
		int score = (int)(Math.random() * 101);
		
		// if문을 작성해보겠습니다.
		// if(조건식){
		// 		실행구문
		// }
		
		System.out.println(score);
		if(score >= 60) {
			System.out.println("당신은 합격했습니다! 축하합니다.");
		}else {
			System.out.println("당신은 불합격했습니다. 더 열심히 준비해주세요.");
		}
	}

}
