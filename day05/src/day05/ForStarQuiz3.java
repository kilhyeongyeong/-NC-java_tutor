package day05;

import java.util.Scanner;

public class ForStarQuiz3 {

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		Scanner sc = new Scanner(System.in);
		int starCnt = sc.nextInt();
		
		for(int i=1; i<=starCnt; i++) {
			for(int j=starCnt-i; j>=1; j--) {
				System.out.print(" ");
			}// j for문
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}// k for문
			System.out.println();
		}// i for문
		
		for(int i=starCnt; i>0; i--) {
			for(int j=0; j<starCnt; j++) {
				System.out.print(j < i-1 ? " " : "*");
			}// j for문
			System.out.println();
		}// i for문
		
//		System.out.println("-----------------");
		
		// 2446
//		for(int i=0; i<starCnt; i++) {
//			for(int j=0; j<starCnt*2-1-i; j++) {
//				System.out.print(j < i ? " " : "*");
//			}// j for문
//			System.out.println();
//		}// i for문
//		for(int i=starCnt-2; i>=0; i--) {
//			for(int j=0; j<starCnt*2-1-i; j++) {
//				System.out.print(j < i ? " " : "*");
//			}// j for문
//			System.out.println();
//		}// i for문
		
		// 10871
//		int n = sc.nextInt();
//		int x = sc.nextInt();
//		
//		
//		int[] iArray = new int[n];
//		for(int i=0; i<iArray.length; i++) {
//			iArray[i] = sc.nextInt();
//		}// i for문
//		
//		String str = "";
//		for(int i : iArray) {.
//			if(i < x) str += i + " ";
//		}// i for문
//		
//		System.out.println(str.trim());
		
		// 10171
//		System.out.println("\\    /\\");
//		System.out.println(" )  ( ')");
//		System.out.println("(  /  )");
//		System.out.println(" \\(__)|");
		
	}

}
