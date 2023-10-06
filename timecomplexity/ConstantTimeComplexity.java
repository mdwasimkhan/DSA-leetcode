package learn.dsa.timecomplexity;

public class ConstantTimeComplexity {

	/*
	 * Example 1
	 */
//	public static void main(String[] args) {
//		System.out.println("Hello Wasim");
//	}
	
	/*
	 * Example 2
	 */
	public static void main(String[] args) {
		ConstantTimeComplexity object = new ConstantTimeComplexity();
		int[] myArray = {1,2,3,4,5};
		System.out.println("Result :"+object.searchMyNumber(myArray));
	}
	public int searchMyNumber(int[] arr) {
		return arr[0];
	}
}
