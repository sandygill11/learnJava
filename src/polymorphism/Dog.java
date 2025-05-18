package polymorphism;

public class Dog {
	
	
	public static void bark() {
		System.out.println("Dog can bark");
	}
	
	public static void bark(int num) {
		System.out.println("Dog can bark 2 time");
	}
	
	public static void bark(String word) {
		System.out.println("Dog can bark bark "+ word);
	}
	
	// method overloading (Compile time polymorphism)
	// method overloading don't required inheritance you can remove extend Animal
	
	//3 ways to achieve 
	//type of parameters
	//number of parameters
	//order of parameters
	
	//you cannot achieve method overloading by changing the return type
	
	
	// method overriding (Run time polymorphism)
	//you cannot over ride static method
	
	public static void main(String[] args) {
		
		bark(0);
		bark("red");
		bark();
		
	}


}
