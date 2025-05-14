package testpackage;

public class MyFirstClass {
	//nouns
	String nose="triangle shape";
	static int age= 24;
	int num = -1;
	double dooo = 23.39449393324413049034901349013940491034910349013490349013490134901490349013490;	//int a=5;

	
	//verbs
	// Cannot make a static reference to the non-static method speak() from the type MyFirstClass
	public static void speak() {
		System.out.println("I Speak !");
		//sleep();
		//MyFirstClass refVar = new MyFirstClass();
		//sleep();
		//MyFirstClass refVar = new MyFirstClass();
		//refVar.sleep();
	}
	
	//naming conventions

	
	// when a static method wants to access non-static, it needs a object
	public void sleep() {
		System.out.println("I Slept");
		
	}

	public static void main(String[] args) {
		if(20>10) {
			System.out.println("Try");
		}if(30>10) {
			System.out.println("Move");
		}
		//sleep();
		//MyFirstClass refVar = new MyFirstClass();
		//refVar.speak();
		
		//ClassName nameofReferenceVariable = new ClassName();
		//MyFirstClass refVar = new MyFirstClass();
		//refVar.sleep();
		//The static method sleep() from the type MyFirstClass should be accessed in a static way
		
		//type name = new //type();
		//main(25);
		
	}
	//public static void main() {
		//System.out.println(a);
		//speak();
	
		
		//ClassName nameofReferenceVariable = new ClassName();
		//MyFirstClass refVar = new MyFirstClass();
		//refVar.sleep();
		//The static method sleep() from the type MyFirstClass should be accessed in a static way
		
		//type name = new //type();
		
		
	//}
	
}

