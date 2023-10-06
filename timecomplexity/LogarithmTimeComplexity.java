package learn.dsa.timecomplexity;

public class LogarithmTimeComplexity {

	/*
	 * Example 1
	 */
//	public static void main(String[] args) {
//		int n =8;
//		for(int i=1;i<=n;i=i*2) {
//			System.out.println("Hello Wasim");
//		}
//	}
	
	/*
	 * Example 2 : Binary search (Array should be sorted in ascending order)
	 */
	public static void main(String[] args) {
		int num = 23;
		int[] arr = {1,2,3,4,5,7,9,11,23,54};
		LogarithmTimeComplexity object = new LogarithmTimeComplexity();
		object.searchNumber(arr, num);
	}
	
	public void searchNumber(int[] arr, int num) {
		
		int first = 0;
		int last = arr.length-1;
		
		int mid = (first+last)/2;
		
		while(first<=last) {
			if(arr[mid] == num) {
				System.out.println("Number found at position :"+mid);
				break;
			} else if(arr[mid] > num) {
				last = mid - 1;
			} else {
				first = mid + 1;
			}
			mid = (first+last)/2;
		}
		
		if(first > last) {
			System.out.println("Number not found");
		}
	}
	
}
