package day03;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 87;
		
		if(score >= 90) {
			System.out.print("A");
		}else if(score >= 80) {
			System.out.print("B");
		}else if(score >= 70) {
			System.out.print("C");
		}else if(score >= 60) {
			System.out.print("D");
		}else {
			System.out.print("F");
		}
		System.out.println("학점입니다.");
	}

}