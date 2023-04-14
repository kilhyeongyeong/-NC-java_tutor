package day08;

public class BasketballPlayer {
	public String name	; // 농구선수의 이름
	public int    height; // 키
	public int    age	; // 나이
	public int    salary; // 연봉
	
	public BasketballPlayer(String pName, int pHeight, int pAge, int pSalary) {
		name	= pName;
		height	= pHeight;
		age		= pAge;
		salary	= pSalary;
	}
	
	// showInfo
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("나이 : " + age);
		System.out.println("연봉 : " + salary);
	}
	
	public void dunkShoot() {
		if(height > 190) {
			System.out.println("덩크슛 성공!");
		}else {
			System.out.println("골대에 안닿음...유감...");
		}
		System.out.println();
	}
}
