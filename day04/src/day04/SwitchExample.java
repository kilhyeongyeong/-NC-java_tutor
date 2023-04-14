package day04;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직급을 입력하세요.\n[사원, 대리, 과장, 차장, 부장]");
		String str = sc.next();
		
		switch(str) {
		case "부장":
			System.out.println("부장의 급여는 600만원입니다.");
			break;
		case "차장":
			System.out.println("차장의 급여는 500만원입니다.");
			break;
		case "과장":
			System.out.println("과장의 급여는 400만원입니다.");
			break;
		case "대리":
			System.out.println("대리의 급여는 300만원입니다.");
			break;
		case "사원":
			System.out.println("사원의 급여는 200만원입니다.");
			break;
		default:
			System.out.println(str + "은(는) 없는 직급입니다.");
			break;
		}// switch-case 닫는 부분
		
		//과제-답
		//Math.random()의 값이 int로 형변환이 되므로 무조건 0으로 출력... 
		//(int)Math.random() * 10 = 0 * 10 = 0
		
	}// main 메소드 닫는 부분

}//클래스 닫는 부분
