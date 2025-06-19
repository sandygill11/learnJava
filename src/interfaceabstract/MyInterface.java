package interfaceabstract;

public interface MyInterface {

	void abstractMethod(); // abstract, must be implemented

	default void defaultMethod() {
		System.out.println("This is a default method in an interface.");
	}
	
	static void staticMethod() {
        System.out.println("Static method in interface.");
    }
	
	public void publicMethod();
	
	public static void main(String[] args) {
		
		MyInterface.staticMethod();
	}

}
