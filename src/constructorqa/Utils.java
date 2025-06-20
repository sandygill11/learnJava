package constructorqa;

public class Utils {
	
	String name = "sandy";

	private Utils() {
		// TODO Auto-generated constructor stub
		
	}
    public static int add(int a, int b) {
        return a + b;
    }
    
    
	
	
	public static void main(String[] args) {
	
		int result = Utils.add(3, 5);  // ✅ Works fine
        System.out.println(result);
        
        Utils utils = new Utils();
		System.out.println(utils.name);
		
	}

}
//
//public class MyUtils {
//
//    // Private constructor to prevent object creation
//    private MyUtils() {
//        // Do nothing or throw exception if needed
//    }
//
//    // Static utility method
//    public static int add(int a, int b) {
//        return a + b;
//    }
//}


















//
//public class Main {
//    public static void main(String[] args) {
//        int result = MyUtils.add(3, 5);  // ✅ Works fine
//        System.out.println(result);
//
//        // MyUtils utils = new MyUtils();  ❌ Error: constructor is private
//    }
//}

