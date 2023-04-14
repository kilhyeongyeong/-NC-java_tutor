package day03;

public class TernaryOperatorQuiz {

	public static void main(String[] args) {
		// 난수, 발생 명령어 Math.random()은 호출 위치에
		// 0보다는 크고 1보다는 작은 난수를 가져다줍니다.
		
		int randomNumber = (int)(Math.random() * 10);
		System.out.println(randomNumber);
		
		String result = (randomNumber <= 7 ? "낙첨" : "당첨");
		System.out.println(result);

	}

}
