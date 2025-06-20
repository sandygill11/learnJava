package constructorqa;

public class Child extends Parent {

	String name;
	int a;
	int b;
	int c;

	private Child() {
		System.out.println("private constructor");
	}
	
	public Child(int a,int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		System.out.println(a+b+c);
	}

	public Child(String name) {
		super("gill");
		this.name = name;
	}

	public static void main(String[] args) {

		Child chd = new Child(1,2,3);
		Child chd2 = new Child();
//		
//		System.out.println(chd.name);
//		System.out.println(chd.surName);
	}
}







//class Vehicle {
//    String type;
//    Vehicle(String type) {
//        this.type = type;
//        System.out.println("Vehicle type: " + type);
//    }
//}
//
//class Car extends Vehicle {
//    String brand;
//    Car(String type, String brand) {
//        super(type);
//        this.brand = brand;
//        System.out.println("Car brand: " + brand);
//    }
//}
//
//class ElectricCar extends Car {
//    int batteryCapacity;
//    ElectricCar(String type, String brand, int batteryCapacity) {
//        super(type, brand);
//        this.batteryCapacity = batteryCapacity;
//        System.out.println("Battery: " + batteryCapacity + " kWh");
//    }
//}
