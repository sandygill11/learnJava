package testpackage;

public class AnotherClass {
	boolean isRain;
	int num;
	String name = "";
	static String car = "jeep";
	
	public void eat(){
		//MyFirstClass.speak();
		
		MyFirstClass sleepAgain = new MyFirstClass();
		
		System.out.println(sleepAgain.nose);
		System.out.println(MyFirstClass.age);
		System.out.println(sleepAgain.num);
		sleepAgain.sleep();
	}
	
	public static void test() {
		int num= 99;
			System.out.println(num);
	}
	
	public static void main(String[] args) {
		

		
		AnotherClass naam = new AnotherClass();
		//System.out.println(naam.name);
		//System.out.println(car);
		//System.out.println(MyFirstClass.age);
		System.out.println(naam.isRain);
		System.out.println(naam.name);

		MyFirstClass sleepAlot = new MyFirstClass();
		System.out.println(sleepAlot.num);
		AnotherClass tryAgain = new AnotherClass();
		tryAgain.eat();
		test();
	}

}
