package day06;

public class Homework1 {

	public static void aaa(int i) {
		System.out.println("aaa");
		System.out.println(i);
	}
	
	public static void bbb() {
		System.out.println("bbb");
	}
	
	public static void ccc(String str, int i) {
		System.out.println("ccc");
		System.out.println(str);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		aaa(1);
		bbb();
		ccc("Hi~!", 123456789);
	}

}
