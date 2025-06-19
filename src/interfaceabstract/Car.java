package interfaceabstract;

public class Car implements Vehicle {

	public void start() {
		System.out.println("Car started.");
	}

	// Optional: override default method
//	public void fuelType() {
//		System.out.println("Electric");
//	}

	public static void main(String[] args) {
		Car car = new Car();
		car.start(); // Output: Car started.
		car.fuelType(); // Output: Petrol or Diesel
	}

}
