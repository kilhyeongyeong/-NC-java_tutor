package day08;

public class Cat {
	public String name ;
	public int 	  age  ;
	public String kind ;
	public String color;
	
	public Cat(String pName, int pAge, String pKind, String pColor) {
		name  = pName ;
		age   = pAge  ;
		kind  = pKind ;
		color = pColor;
	}
	
	// 설계 클래스 내부에 선언하는 메서드는 static을 사용하지 않습니다.
	public void showCatInfo() {
		System.out.println(name );
		System.out.println(age  );
		System.out.println(kind );
		System.out.println(color);
		System.out.println(     );
	}
	
//	public void test() {
//		CatVO vo = new CatVO();
//	}
}
