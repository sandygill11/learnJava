package interfaceabstract;

public interface A {
	default void myMethod() {
		System.out.println("Method from A");
	}
}
