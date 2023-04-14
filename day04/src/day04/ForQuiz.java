package day04;

public class ForQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ran = (int)(Math.random() * 9) + 1;
		
		for(int i=1; i<10; i++) {
			System.out.println(ran*i);
		}
	}

}
