package accessmodifierstwo;

import accessmodifiers.Animal;

public class Fish {

	public void swim() {
		
		Animal obj = new Animal();
		
		System.out.println(obj.name);
		// name is public
		
//		
//		System.out.println(obj.breed);
//		System.out.println(obj.color);
//		// color is private cannot be accessed
//		System.out.println(obj.age);

	}

	public static void main(String[] args) {

		Fish fishObj = new Fish();
		
		fishObj.swim();
		

	}

}
