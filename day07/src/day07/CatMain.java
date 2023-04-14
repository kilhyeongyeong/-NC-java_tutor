package day07;

public class CatMain {
	
	// 고양이를 조회하는 용도로 사용할 전용 메서드를 작성해보겠습니다.
	public static void showCatInfo(Cat cat) {
		System.out.println("고양이 이름 : " + cat.name);
		System.out.println("고양이 나이 : " + cat.age);
		System.out.println("고양이 색상 : " + cat.color);
		System.out.println("고양이 성별 : " + cat.sex);
		System.out.println();
	}

	public static void main(String[] args) {
		// 고양이를 한 마리 생성해보겠습니다.
		Cat cat1 = new Cat();
		
		cat1.name = "어완자";
		cat1.age = 5;
		cat1.color = "Yellow";
		cat1.sex = "남";
		
		showCatInfo(cat1);
		
		Cat cat2 = new Cat();
		
		cat2.name = "하잉";
		cat2.age = 1;
		cat2.color = "White";
		cat2.sex = "여";
		
		showCatInfo(cat2);
		
		Cat cat3 = new Cat();
		
		cat3.name = "오홍";
		cat3.age = 2;
		cat3.color = "black";
		cat3.sex = "여";
		
		showCatInfo(cat3);
		
		// 과제
		// c2, c3를 새롭게 생성
		// 이 고양이들도 showCatInfo로 조회할 때
		// 메모리 구조가 어떻게 전개 될지 직접
		// 그려보기
		// c1, c2, c3을 조회하는 각각의 순간
		// 3장의 메모리 구조 그림을 보내주세요

	}

}
