package day05;

import java.util.Scanner;

public class ForStarQuiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int starCnt = sc.nextInt();
		
		for(int i=0; i<starCnt; i++) {
			for(int j=5-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		System.out.println("----------------------");
		
		// 2445
//		for(int i=0; i<starCnt; i++) {
//			for(int j=0; j<starCnt*2; j++) {
//				System.out.print(j<=i || starCnt*2-j<=i+1 ? "*" : " ");
//			}
//			System.out.println();
//		}
//		for(int i=starCnt-1; i>0; i--) {
//			for(int j=0; j<starCnt*2; j++) {
//				System.out.print(j<i || starCnt*2-j<=i ? "*" : " ");
//			}
//			System.out.println();
//		}

	}

}
