package poly.instanceof_;

public class Human {

	private String name;
	private int    age ;
	
	public Human() {
		this("noname", 0);
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age  = age ;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age );
		System.out.println("------------------");
	}
}
