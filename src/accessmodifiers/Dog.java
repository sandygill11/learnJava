package accessmodifiers;

public class Dog {
	
	public void bark() {
		
		Animal obj = new Animal();
		
		System.out.println(obj.name);
		System.out.println(obj.breed);
		//System.out.println(obj.color);
		// color is private cannot be accessed
		System.out.println(obj.age);
		
	}
	
	public static void main(String[] args) {
		
		Dog dogObj = new Dog();
		
		dogObj.bark();
	}
}
