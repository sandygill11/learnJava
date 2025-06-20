package constructorqa;

public class Constructor {

	String name = "andy";
	int num;

//	public Constructor(String name, int num) {
//		this.name = name;
//		this.num = num;
//	}

	private Constructor() {
		System.out.println("this is constructor");
	}

//	Constructor(int num) {
//
//		this.num = num;
//	}

	public int myName(int num) {
		return num;
	}

	public String myName() {
		return name;
	}

	public static void main(String[] args) {
//
		Constructor obj = new Constructor();
//		Constructor obj2 = new Constructor(5);
//
//		System.out.println(obj2.name);
//		System.out.println(obj2.num);
//
//		System.out.println(obj.myName());

	}

}

/*
 * 1. What is the purpose of a constructor in Java? To create objects and
 * intialize variables.
 *
 * The primary purpose of a constructor in Java is to initialize newly created
 * objects of a class. When an object is instantiated using the new keyword, its
 * corresponding constructor is automatically invoked.
 * 
 * 2. Can a constructor have a return type in Java? No
 * 
 * 3. What happens if no constructor is defined in a Java class?
 * 
 * If no constructor is explicitly defined in a Java class, the Java compiler
 * automatically provides a default no-argument constructor.
 * 
 * 4. Can constructors be overloaded in Java? Yes
 * 
 * 5. What is the difference between a default constructor and a no-argument
 * constructor?
 * 
 * If a constructor does not accept any parameters, it is known as a no-argument
 * constructor.
 * 
 * 6. What access modifier does the compiler use when it auto-generates a
 * default constructor?
 * 
 * When a compiler auto-generates a default constructor, it uses the public
 * access modifier. This means the constructor can be accessed from anywhere in
 * the code, both within the same class, package, or even other assemblies if
 * applicable.
 * 
 * 7. What is the difference between this() and super() in constructors? super
 * and this keyword super() as well as this() keyword both are used to make
 * constructor calls. super() is used to call Base class's constructor(i.e,
 * Parent's class) while this() is used to call the current class's constructor.
 * 
 * 8. Can a constructor be private? Give a real-world use case.
 * 
 * YES, A private constructor is used to restrict instantiation of a class from
 * outside. This is useful in specific design patterns and scenarios where
 * object creation needs to be controlled.
 * 
 * 9. Why can’t we use both this() and super() in the same constructor?
 * 
 * you achieve both this() and super(), but not in the same constructor directly
 * — you do it by chaining through another constructor.
 * 
 * 10. Can a constructor be marked as protected? In what scenario?
 * 
 * You don't want the class to be instantiated directly by just anyone
 * 
 * But you want inheriting classes to still be able to call the constructor
 * 
 * 11. Can a top-level class in Java have a private constructor? Why or why
 * not?????
 * 
 * 12. Are constructors inherited in Java? If not, how can a subclass call a
 * parent constructor?
 * 
 * No, constructors are not inherited in Java.
 * 
 * A subclass does not inherit constructors from its superclass.
 * 
 * But a subclass can call a superclass constructor using super().
 * 
 * 13. What will happen if a superclass has only a parameterized constructor and
 * the subclass does not call super(...)?
 * 
 * Compile time error
 * 
 * 14. Can abstract classes have constructors? If yes, when are they called?
 * 
 * Yes 



 * 
 * 
 * 
 */
