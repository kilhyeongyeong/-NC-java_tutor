package poly.static_.var;

public class Asean {
	
	private String name;
	private int attendanceScore; // 출결
	private int finalTermScore ; // 기말
	
	public static int presentationScore; //
	
	public Asean(String name, int attendanceScore, int finalTermScore) {
		this.name = name;
		this.attendanceScore = attendanceScore;
		this.finalTermScore = finalTermScore;
	}
	
	static {
		presentationScore = 29;
	}
	
	public void showStudentScore() {
		System.out.println("학생명 : " + name);
		System.out.println("출결점수 : " + attendanceScore);
		System.out.println("팀점수 : " + presentationScore);
		System.out.println("기말점수 : " + finalTermScore);
		System.out.println("최종점수 : " + (attendanceScore
									  + presentationScore
									  + finalTermScore));
		System.out.println("--------------------------");
	}
}
