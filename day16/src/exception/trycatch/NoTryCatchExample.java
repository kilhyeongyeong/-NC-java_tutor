package exception.trycatch;

import java.util.Scanner;

public class NoTryCatchExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int prevValue = scan.nextInt();
		int nextValue = scan.nextInt();
		
		if(nextValue != 0) {
			System.out.println(prevValue/nextValue);
		}else {
			System.out.println("0을 나누는 값으로 넣을 수 없습니다.");
		}
		
		scan.close();

	}

}
