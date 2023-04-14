package day08;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car("mini", 4, 0, "Me", 100);
		
		for(int i=0; i<3; i++) car.accelerate();
		
		car.showStatus();
		
		car.break_();
		car.break_();
		
		car.showStatus();
	}

}
