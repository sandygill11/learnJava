package interfaceabstract;

public abstract class Abstract {
	String name;

	abstract void makeSound(); // abstract method

	void breathe() { // concrete method

		// Concrete methods in an abstract class can provide default or
		// common behavior that can be inherited and reused by all subclasses.
		// This reduces code duplication and promotes consistency.

		System.out.println("Breathing...");
	}
	
	public static void main(String[] args) {
		
		//new Abstract();
	}

}
