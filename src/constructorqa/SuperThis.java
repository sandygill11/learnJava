package constructorqa;

public class SuperThis extends SuperThisParent {

	String n;
	
	public SuperThis() {
		//super();
		this("mad");
		
	}
	
	public SuperThis(String n) {
		super();
		System.out.println(n);
		
	}
	
	
	public static void main(String[] args) {
		
		SuperThis st = new SuperThis();
	
	}
}
