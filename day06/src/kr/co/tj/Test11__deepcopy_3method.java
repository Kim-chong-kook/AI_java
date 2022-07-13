package kr.co.tj;

import java.util.Arrays;

public class Test11__deepcopy_3method { // 깊은 복사 : 공간을 새로 만들어 복사함.
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[4];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // 깊은 복사1
		arr2 = Arrays.copyOf(arr1, arr1.length); // 깊은 복사2
		arr2 = arr1.clone(); // 깊은 복사3
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		
	}
}
