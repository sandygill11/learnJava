package inheritance;

public class Dog extends Animal {

	// overriding method in java

	// you cannot override the static method
	// trick main method in static cannot over ride
//	public void jump() {
//		System.out.println("dog Can Jump");
//		
//	}

	public static void bark() {
		System.out.println("Dog can bark");
	}

	public static void main(String[] args) {
		//Dog myDog = new Dog();

		//Animal ani = new Dog();
//	        myDog.eat();  // Inherited method
//	        myDog.bark(); // Method of Dog class
		// myDog.jump();
		//myDog.jump();
		//ani.jump();
	}
}

//	public static void main(String[] args) {
//		bark();
//		
//		//Dog dg = new Dog();
//		//Animal al = new Animal();
//		
//		//Animal amml = new Dog();
//		
//		//amml.jump();
//	}
//	}
