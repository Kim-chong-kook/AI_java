package kr.co.tj;

public class ArrayTest2 {

	public static void main(String[] args) {
		//int[] numbers = {10,20,30};// TODO Auto-generated method stub
		int[] numbers = new int[] {10,20,30};
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		for(int i: numbers) { // 읽기만 가능한 향상된 for문, for each.
			System.out.println(i);
		}
	}

}
