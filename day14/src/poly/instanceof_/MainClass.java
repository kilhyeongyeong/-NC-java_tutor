package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
		Human h1 = new Human("브이", 20);
		h1.showInfo();
		
		Student s1 = new Student("이응", 19);
		s1.showInfo();
		
		Cat c1 = new Cat("룰루", 5);
		c1.meow();
		
		System.out.println(h1 instanceof Human);
		System.out.println(s1 instanceof Human);
		
		// 관련 없는 객체간 비교는 에러 발생
//		System.out.println(c1 instanceof Human);
		
		System.out.println(h1 instanceof Student);
		System.out.println(s1 instanceof Student);
		
		// 관련 없는 객체간 비교는 에러 발생
//		System.out.println(c1 instanceof Student);

	}

}
