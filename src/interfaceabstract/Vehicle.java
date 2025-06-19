package interfaceabstract;

public interface Vehicle {

	void start(); // abstract method

	default void fuelType() {
		System.out.println("Petrol or Diesel");
	}

}
