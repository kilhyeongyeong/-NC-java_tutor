package exception.runtime;

public class NumberFormatExample {

	public static void main(String[] args) {
		String a = "35";
		String b = "21";
		System.out.println(a+b);
		
		// 장기적으로 더 나은코드
		StringBuffer c = new StringBuffer("35").append("21");
//		StringBuilder c = new StringBuilder("35").append("21");
		System.out.println(c);
		
		// Str -> int 변환
		// Integer.parseInt("문자열")이 요구 문법
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		System.out.println(i+j);
		
		String str = "hello";
		System.out.println(Integer.parseInt(str));

	}

}
