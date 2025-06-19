package interfaceabstract;

public class YourInterface implements MyInterface{

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("from MyInterface");
	}
//	
//	default void defaultMethod() {
//		System.out.println("This is a default method in an interface.");
//	}
//	
//	static void staticMethod() {
//        System.out.println("Static method in interface.");
//    }
	
	
	public static void main(String[] args) {
		
		YourInterface obj2 = new YourInterface();
		obj2.abstractMethod();
		obj2.defaultMethod();
		
		obj2.publicMethod();
		
	}


	@Override
	public void publicMethod() {
		// TODO Auto-generated method stub
		System.out.println("Public");
		
	}
	
	
}
