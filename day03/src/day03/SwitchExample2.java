package day03;

public class SwitchExample2 {

	public static void main(String[] args) {
		String[] foods = {"떡볶이", "스테이크", "초밥", "마라탕", "커리"};
		
		int idx = (int)(Math.random() * 5);
		
		System.out.println(foods[idx]);
		switch(foods[idx]) {
		case "떡볶이":
			System.out.println("한식입니다.");
			break;
		case "스테이크":
			System.out.println("양식입니다.");
			break;
		case "마라탕":
			System.out.println("중식입니다.");
			break;
		default:
			System.out.println("기타요리입니다.");
			break;
		}

	}

}
