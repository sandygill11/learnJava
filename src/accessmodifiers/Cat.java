package accessmodifiers;

public class Cat extends Animal {

	public void sleep() {

		//Animal obj = new Cat();

		System.out.println(name);
		System.out.println(breed);
		//System.out.println(obj.color);
		// color is private cannot be accessed
		System.out.println(age);

	}

	public static void main(String[] args) {
		
		Cat catObj = new Cat();
		
		catObj.sleep();
	}
}
