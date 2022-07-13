package kr.co.tj;

public class Test10__not_deep_copy { // 얕은 복사
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = arr1;
		for(int x:arr1) {
			System.out.print(x);
			
		}
		System.out.println();
		arr2[1]=5; // 한곳에서 변경해주면,
		
		System.out.println();
		for(int x:arr1) {
			System.out.print(x); // 양쪽 다 변경됨.
		}
		System.out.println();
		for(int x:arr2) {
			System.out.print(x); // 양쪽 다 변경됨.
		}
	}
}
