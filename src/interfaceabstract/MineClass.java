package interfaceabstract;

public class MineClass implements A, B {

//	@Override
//	public void myMethod() {
//		// Option 1: Provide a custom implementation
//		System.out.println("Custom implementation in MyClass");

//	@Override
//	public void myMethod() {
//		// TODO Auto-generated method stub
//		B.super.myMethod();
//	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		A.super.myMethod();
	}

	public static void main(String[] args) {

		MineClass obj = new MineClass();
		obj.myMethod();
	}
}
