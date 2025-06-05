package constructor;

public class ConstrEx {

	public ConstrEx() {
		//this(54);
		//super("mandy");
		// name = "Sandy";
	}

	public ConstrEx(String name) {
		//super("peter");
		this.name = name;

	}
	
//	public ConstrEx(int number) {
//		
//		this.number = number;
//		
//	}

	String name = "sandy"; // initialize variable , intialize name using a constructor
	int number;
	boolean isRed;

	public static void main(String[] args) {

		// constructor - it helps to construct
		// construct an object using constructor
		// constructor don't return anything

		// there is also a default constructor

		// constructor is used to crate an object & initialize variable

		// type of variable Reference variable = object new ConstrEx()
		ConstrEx cx = new ConstrEx("yup");
		
		
		
		System.out.println(cx.name);

	}

}
