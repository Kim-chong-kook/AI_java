package kr.co.tj3;

public class ArryTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {10,20,30}; // 바로 값을 넣는 방법
		int[] arr = new int[10];
		int total = 0;
		int num=1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=num;
			num++;
		}
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
		}
		System.out.println(total);

	}

}
