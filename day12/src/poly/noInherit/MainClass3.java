package poly.noInherit;

public class MainClass3 {

	public static void main(String[] args) {
		
		// Warrior intance
		Warrior wr1 = new Warrior("vvv");
		
		// Rabbit intance
		Rat r1 = new Rat();
		Rat r2 = new Rat();
		
		wr1.showStatus();
		
		wr1.huntRat(r2);
		wr1.showStatus();
		
		wr1.huntRat(r2);
		wr1.showStatus();

	}

}
