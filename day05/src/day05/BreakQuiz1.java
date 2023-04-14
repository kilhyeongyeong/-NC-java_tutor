package day05;

import java.util.Scanner;

public class BreakQuiz1 {

	public static void main(String[] args) {
		// 1. 난수 2개를 발생시켜 주세요. 단, 난수는 1 ~ 10범위로 두 개 만들어 주세요.
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		
		// 2. while문을 무한루프로 만들어주시고, 위에서 발생된 난수 2개를
		//    a * b의 답은? 이라고 질문해서 문제를 출제하게 해 주세요.
		Scanner sc = new Scanner(System.in);
		while(true) {
			// 3. if문으로 비교해 정답시 break;로 루프문을 빠져나오고
			// 	  오답인 경우 "오답입니다." 라는 멘트와 함께 답을 재입력 받도록 해주세요
			System.out.println("a * b의 답은?");
			if(sc.nextInt() == a * b) break;
			else System.out.println("오답입니다.");
		}
		
		System.out.println("정답입니다.");
		System.out.println("a : " + a + ", b : " + b + ", a * b = " + a*b);
		
	}

}
