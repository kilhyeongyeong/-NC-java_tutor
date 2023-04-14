package day03;

public class IfQuiz {

	public static void main(String[] args) {
		int number = -4;
		
		if(number > 0) {
			System.out.println((number%2 == 0 ? "짝수" : "홀수") + " 양수입니다.");
		}else if(number < 0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}

	}

}
