package day08;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		BasketballPlayer bp1 = new BasketballPlayer("오잉", 18, 194, 1000);
		BasketballPlayer bp2 = new BasketballPlayer("호잇", 18, 187, 800);
		
		bp1.showInfo();
		bp1.dunkShoot();
		
		bp2.showInfo();
		bp2.dunkShoot();

	}

}
