package practicepackage;

public class Practice {

	public static void sumArr(int[] a) {
		
		//int num = 0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
//		for (int i: a ) {
//			num = num + i;
//		}
//		System.out.println(num);
//		
		
	}

	public static void main(String[] args) {

		int[] arr = {1,2,10,33,5};
		
		sumArr(arr);

	}
}
