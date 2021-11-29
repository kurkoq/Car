import java.util.Scanner;

public class Car {

	private String brand;
	private String model;
	private int amountOfFuel;

	public Car(String b, String m, int f) {
		brand = b;
		model = m;
		amountOfFuel = f;
		printData();
	}
	
	public Car() {
		brand = "";
		model = "";
		amountOfFuel = 0;
		printData();
	}

	public void brake() {
		System.out.println("Car is braking");
	}

	public void accelerate() {
		if (amountOfFuel > 0) {
			System.out.println("Car is accelerating");
			amountOfFuel--;
		}
	}
	
	public void fastAccelerate() {
		if (amountOfFuel > 0) {
			System.out.println("Car is accelerating fast");
			amoountOfFuel = amountOfFuel - 2;
		}
	}
	
	public void refuel(int amount) {
		System.out.println("Fuel in the tank: " + amountOfFuel + "\n" + "Refuel: " + amount);
		amountOfFuel += amount; 
		System.out.println("Fuel in the tank after the refuel: " + amountOfFuel);
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String m) {
		model = m;
	}
	
	private void printData() {
		System.out.println("Brand: " + brand + "\n" + "Model: " + model + "\n" + "Fuel: " + amountOfFuel);
	}

	public static void main(String[] args) {

		Car car = new Car("BMW", "M3", 50);
		System.out.println("a=accelerate b=break x=exit");
		Scanner s = new Scanner(System.in);
		
		while (true) {
			String input = s.nextLine();
			
			if (input.equals("x")) {
				break;
			}
			
			if (input.equals("a")) {
				car.accelerate();
			}
			
			if (input.equals("b")) {
				car.brake();
			}
		}
		s.close();
	}

}
