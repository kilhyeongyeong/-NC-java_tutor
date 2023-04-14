package day02;

public class UnaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자 ++,--
		int i = 1;
		int j = i++; // 후위연산자는 먼저 해당 코드를 수행하고, 뒤늦게 연산자 로직을 수행합니다.
		// int j = i 를 먼저 수행하고 (i 는 1)
		// i++을 수행해 1을 더합니다. (i 는 2)
		// 최종적으로 j는 i, i는 2를 저장받습니다.
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("------------------------");
		
		int x = 1;
		int y = ++x;
		// ++x을 먼저 수행하여 1을 더한 후 (x 는 2)
		// int y = x를 수행합니다.
		// 최종적으로 y는 x+1, x=2를 저장받습니다.
		
		System.out.println(x);
		System.out.println(y);
	}

}
