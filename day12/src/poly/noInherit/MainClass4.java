package poly.noInherit;

public class MainClass4 {

	public static void main(String[] args) {
		
		// Warrior intance
		Warrior wr1 = new Warrior("vvv");
		
		// Rabbit intance
		Pig   p1 = new Pig();
		Ghost g2 = new Ghost();
		
		wr1.showStatus();
		
		wr1.huntPig(p1);
		wr1.huntPig(p1);
		wr1.huntPig(p1);
		wr1.huntPig(p1);
		wr1.huntPig(p1);
		wr1.showStatus();
		
		wr1.huntGhost(g2);
		wr1.showStatus();

	}

}
