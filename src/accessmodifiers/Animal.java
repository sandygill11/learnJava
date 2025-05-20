package accessmodifiers;

public class Animal {

	// access modifiers
	// private, public, protected, default
	
	public String name = "Cream";
	String breed = "Bulldog";
	// breed is default
	
	private String color = "Black";
	protected int age = 5;
 

	public void jump() {
		System.out.println("Animal can Jump");
	}

	public void eat() {
		System.out.println("Animal can eat");
		
		//System.out.println(name);
		//System.out.println(breed);
		System.out.println(color); 
		System.out.println(age);
		
		//private, public, protected, default member of a class can be accessed within class
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Animal obj = new Animal();
		
		System.out.println(obj.color);
		
		obj.eat();
	}
}

//| Modifier    | Access Level                                              |
//| ----------- | --------------------------------------------------------- |
//| `public`    | Accessible from **anywhere**                              |
//| `private`   | Accessible **only within the same class**                 |
//| `protected` | Accessible within the **same package** and **subclasses** |
//| *(default)* | (No modifier) Accessible within the **same package only** |
//
/*
 * Why Use Different Access Modifiers?
| Modifier    | Purpose                                                                                                      |
| ----------- | ------------------------------------------------------------------------------------------------------------ |
| `private`   | 🔐 **Hide internal details**. Keeps class internals (data and helper methods) safe from external misuse.     |
| *(default)* | 🧩 **Package-level access**. Good for internal cooperation among classes in the same package.                |
| `protected` | 🧬 **Allow subclassing**. Useful in inheritance — child classes can reuse or override protected behavior.    |
| `public`    | 🌐 **Expose functionality**. Makes code accessible from anywhere — for APIs, services, or main program flow.

 
 | Modifier    | Analogy                                                                    |
| ----------- | -------------------------------------------------------------------------- |
| `private`   | Like a **private diary** — only you can read it.                           |
| `default`   | Like a **shared apartment** — roommates (same package) can use things.     |
| `protected` | Like **family access** — trusted relatives (subclasses) can see/use parts. |
| `public`    | Like a **public website** — accessible by anyone worldwide.                |
|
*/
