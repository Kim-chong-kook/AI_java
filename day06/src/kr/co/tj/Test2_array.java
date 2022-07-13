package kr.co.tj;

public class Test2_array {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2;
		//arr2 = {1,2,3,4,5}; // 에러
		arr2 = new int[] {1,2,3,4,5};
		
		System.out.printf("%d\n",arr.length);
		System.out.printf("%d",arr.length);
		
		//arr = {1,2,3,4,5,6};
	}

}
