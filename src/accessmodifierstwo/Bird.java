package accessmodifierstwo;

import accessmodifiers.Animal;

public class Bird extends Animal {

	public void fly() {
		
		//Animal obj = new Bird();

		System.out.println(name);
		//System.out.println(obj.breed);
		//System.out.println(obj.color);
		// color is private cannot be accessed
		System.out.println(age);

	}

	public static void main(String[] args) {
		
		Bird birdObj = new Bird();
		
		birdObj.fly();

	}
}
