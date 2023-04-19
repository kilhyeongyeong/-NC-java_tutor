package api.lang.string;

public class StringReplace {

	public static void main(String[] args) {
		// 자바는 15버전부터 멀티라인 문자열을 지원합니다.
		// 자바 ㅁㄴ자열은 여닫는 "를 한 줄에 작성해야 했습니다.
		// String a = "가나다라"; // 허용
		// String a = "가나다라"
		// 				마바사" // 허용안됨
		// 여닫는 따옴표를 여러 줄에 걸쳐서 작성할 때는 """ 세 개를 이용합니다.
		// """를 사용한 줄에는 문자열을 작성할 수 업고, 사이에만 작성할 수 있습니다.
		String notice = """
				우와
				신기하다
				우와아아아
				우오아아아아아아아앙
				첫째줄은 쓰면 안돼용
				마지막줄은 써도 되네용""";
		
		System.out.println(notice);
		// replace() 는 String을 리턴하고, 첫 단어를 두 번째 단어로 바궈줍니다.
		String newNotice = notice.replace("아", "어");
		System.out.println(newNotice);
	}

}
