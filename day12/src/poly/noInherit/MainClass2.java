package poly.noInherit;

public class MainClass2 {

	public static void main(String[] args) {
		
		// Warrior intance
		Warrior wr1 = new Warrior("vvv");
		
		// Rabbit intance
		Rabbit r1 = new Rabbit();
		Rabbit r2 = new Rabbit();
		
		wr1.showStatus();
		
		wr1.huntRabbit(r2);
		wr1.huntRabbit(r2);
		wr1.showStatus();

	}

}
