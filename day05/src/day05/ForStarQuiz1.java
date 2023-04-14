package day05;

import java.util.Scanner;

public class ForStarQuiz1 {

	public static void main(String[] args) {
		
		// *
		// **
		// ***
		// ****
		// *****
		
		Scanner sc = new Scanner(System.in);
		int starCnt = sc.nextInt();
		
		for(int i=0; i<starCnt; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2444
//		for(int i=0; i<starCnt; i++) {
//			for(int j=1; j<=starCnt+i; j++) {
//				System.out.print(j<starCnt-i ? " " : "*");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<starCnt-1; i++) {
//			for(int j=0; j<starCnt*2-i-2; j++) {
//				System.out.print(j<i+1 ? " " : "*");
//			}
//			System.out.println();
//		}

	}

}
