package api.lang.string;

import java.util.Scanner;

public class StringIndexOfQuiz {

	public static void main(String[] args) {
		// 1. 특정 문장을 스캐너로 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 입력 \n>>");
		String str = sc.nextLine();
		
		// 2. 조회할 단어
		System.out.print("조회할 단어 \n>>");
		String word = sc.next();
		
		// 3. 단어 갯수 + 인덱스
		int totalCnt = 0; // 감지 횟수
		int searchedIndex = 0;	// 단어 감지 인덱스
		
		for(int i=0; i<str.length(); i++){
			searchedIndex = str.indexOf(word, i);
			if(i < searchedIndex) i = searchedIndex;
			if(searchedIndex == -1) break;
			System.out.println("단어감지 인덱스 : " + searchedIndex);
			totalCnt++;
		}

		System.out.println("단어찾기 종료, 총 갯수 : " + totalCnt);
	}

}
