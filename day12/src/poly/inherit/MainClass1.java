package poly.inherit;

public class MainClass1 {

	public static void main(String[] args) {
		// Warrior intance
				Warrior wr1 = new Warrior("vvv");
				
				// Rabbit intance
				Monster rab1 = new Rabbit();
				Monster rat2 = new Rat();
				
				wr1.showStatus();
				
				wr1.hunt(rab1);
				wr1.showStatus();
				
				wr1.hunt(rat2);
				wr1.showStatus();
				
				wr1.hunt(rat2);
				wr1.showStatus();

	}

}
