package interfaceabstract;

public class Interface {

	interface Animal {
		public void animalSound(); // interface method (does not have a body)

		public void sleep(); // interface method (does not have a body)
	}

}

/*
 * => What is an interface in Java, and why is it used?
 * 
 * An interface is a blueprint of a class that defines a set of methods that a
 * class must implement. It is used to group related methods with empty bodies.
 * 
 * => Can a Java interface have method implementations? If yes, how?
 * 
 * Yes, a Java interface can have method implementations — starting from Java 8
 * ✅ 1. Default Methods These are methods with a body (implementation) using the
 * default keyword.
 * 
 * Use case: To add new functionality to interfaces without breaking existing
 * implementations.
 * 
 * ✅ 2. Static Methods You can define static methods with a body inside
 * interfaces.
 * 
 * Use case: Utility or helper methods related to the interface.
 * 
 * => What is a default method in an interface? A default method in a Java
 * interface is a method that has a body (implementation) and is declared using
 * the default keyword. It allows interfaces to have method implementations
 * without affecting the classes that already implement the interface.
 * 
 * => How is an interface different from an abstract class? An interface defines
 * a contract for what methods a class must implement, while an abstract class
 * can provide both a contract (abstract methods) and some default
 * implementation (concrete methods).
 *
 * => Can a class implement multiple interfaces in Java? Yes, a class in Java
 * can implement multiple interfaces. This is a key feature of Java that allows
 * for achieving a form of multiple inheritance of behavior, even though Java
 * does not support multiple inheritance of classes. When a class implements
 * multiple interfaces, it must provide concrete implementations for all the
 * abstract methods declared in each of those interfaces. The interfaces are
 * listed after the implements keyword, separated by commas.
 * 
 * => What is an abstract class in Java? An abstract class in Java is a class
 * that is declared with the abstract keyword. It serves as a blueprint for
 * other classes and cannot be instantiated directly, meaning you cannot create
 * objects of an abstract class.
 * 
 * => Can we create an object of an abstract class? Why or why not? No, an
 * object of an abstract class cannot be created directly. Reason: Abstract
 * classes are designed to be incomplete. They may contain abstract methods,
 * which are declared but do not have an implementation (a method body).
 * Creating an object of such a class would result in an object with undefined
 * or incomplete functionality, as the abstract methods would lack concrete
 * behavior. Purpose of Abstract Classes: Abstract classes serve as blueprints
 * for other classes. They define a common interface and potentially some shared
 * implementation for a group of related classes. Subclasses that inherit from
 * an abstract class are required to provide concrete implementations for all
 * inherited abstract methods, making them "complete" and instantiable.
 * 
 * =>Can an abstract class have both abstract and non-abstract methods? Yes
 * 
 * => What happens if a class does not implement all methods from an interface?
 * If a class does not implement all the methods from an interface, it must be
 * declared as abstract — otherwise, the compiler will throw an error.
 * 
 * => Can a class extend an abstract class and implement an interface at the
 * same time? Yes, a class in Java can extend an abstract class and implement an
 * interface at the same time — and this is actually a common design pattern.
 * 
 * => How do you resolve conflict if two interfaces have the same default
 * method? When a class implements two interfaces with the same default method,
 * it results in a conflict that requires explicit resolution by the
 * implementing class. The class must override the default method and either
 * provide its own implementation or explicitly call one of the interface's
 * default implementations using InterfaceName.super.methodName().
 * 
 * => What are the key differences between interface variables and abstract
 * class variables?
 * 
 * | Feature | **Interface Variables** | **Abstract Class Variables** | |
 * ----------------------- | ---------------------------------------- |
 * ------------------------------------------------------ | | **Modifiers** |
 * Always `public static final` (constants) | Can be any access level
 * (`private`, `protected`, etc.) | | **Initialization** | Must be initialized
 * at declaration | Can be initialized later (e.g., in constructor) | |
 * **Instance Variables?** | ❌ No — no instance variables allowed | ✅ Yes — can
 * have instance variables | | **Shared per Class?** | ✅ Yes — shared as
 * constants (static) | ❌ No — each object has its own copy | | **Mutable?** | ❌
 * No — final, cannot be changed | ✅ Yes — can be modified | | **Purpose** |
 * Constants or configuration values | Store state or behavior for subclasses |
 * 
 * 
 * =>When should you use an interface over an abstract class? When we talk about
 * abstract classes we are defining characteristics of an object type;
 * specifying what an object is.
 * 
 * When we talk about an interface and define capabilities that we promise to
 * provide, we are talking about establishing a contract about what the object
 * can do.
 * 
 * Yes, an abstract class can implement an interface without implementing all of
 * its methods — but it must itself be declared as abstract.
 * 
 * => Can an abstract class implement an interface without implementing all its
 * methods? ✅ Why This Works: In Java, if a class implements an interface, it is
 * expected to implement all the interface’s methods.
 * 
 * However, if the class is declared abstract, it is allowed to leave some or
 * all methods unimplemented.
 * 
 * 
 * The responsibility then passes to the first concrete subclass to implement
 * the remaining methods.
 * 
 * Yes, an abstract class can implement an interface without implementing all of
 * its methods — but it must itself be declared as abstract.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */