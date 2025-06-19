package interfaceabstract;

public interface B {
	default void myMethod() {
		System.out.println("Method from B");
	}
}
