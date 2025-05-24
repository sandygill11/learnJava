package stringsmethods;

public class StringsMethodsExample {
	
	public static void String1() {
		
		// char at
		String name = "Sandy";
		
		System.out.println(name.charAt(0));
		
	}
	
	public static void String2() {
		
		//compare to
		
		String myStr1 = "Alpha";
		String myStr2 = "Beta";
		String myStr3 = "Alpha";
		
		// 0 when both are equal and -1 when not equal
		System.out.println(myStr1.compareTo(myStr3));
		System.out.println(myStr1.compareTo(myStr2));
		
	}
	
	public static void String3() {
		
		// compareToIgnoreCase
		
		String myStr1 = "Alpha";
		String myStr2 = "alpha";
		
		System.out.println(myStr1.compareToIgnoreCase(myStr2));
 		
	}
	
	public static void String4() {
		
		//concatenate
		
		String name = "Sandy ";
		String lastName = "Gill";
		
		System.out.println(name.concat(lastName));
		
	}
	
	public static void String5() {
		
		// contains
		
		String name = "Sandeep";
		
		System.out.println(name.contains("s"));
	}
	
	public static void String6() {
		
		//content equal
		
		String name = "Sandy";
		
		System.out.println(name.contentEquals("Sandy"));
	}
	
	public static void String7() {
		
		// ends with
		
		String myStr = "Selenium";
		
		System.out.println(myStr.endsWith("um"));
	}
	
	public static void String8() {
		
		// format string
		
		String aboutMe  = "My name is %s. My weight is %f kg";
		
		System.out.println(String.format(aboutMe, "Sandy", 85.5));
	}
	
	public static void String9() {
		
		// index of 
		
		String myStr = "I am learning Selenium.";
		
		System.out.println(myStr.indexOf("Sl"));
	}
	
	public static void String10() {
		
		// join method
		
		System.out.println(String.join(" " ,"Sandy", "is", "learning", "Java."));
		
	}
	
	public static void String11() {
		
		// last index of
		
		String myStr = "Java is best for Software testing.";
		
		System.out.println(myStr.lastIndexOf("."));
	}
	
	public static void String12() {
		
		// length of
		
		String myStr = "Java is best for Software testing.";
		
		System.out.println(myStr.length());
	}
	
	public static void String13() {
		
		// replace
		
		String myStr = "Yelp. Year";
		
		System.out.println(myStr.replace("Y", "H"));
		
	}
	
	public static void String14() {
		
		// replace all
		
		String myStr = "Apple is the best. Apple is better then Samsung.";
		
		System.out.println(myStr.replaceAll("Apple", "Samsung"));
	}
	
	
	
	public static void main(String[] args) {
		
		String14();
		
	}

}
