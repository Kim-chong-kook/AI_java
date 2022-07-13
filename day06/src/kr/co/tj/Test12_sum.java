package kr.co.tj;

public class Test12_sum {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int total = 0;
		
		for(int i=0,num=1; i<arr.length;i++,num++) {
			arr[i] = num; // 방의 수 10만큼 각각의 배열방에 수를 넣는다.
		}
		for(int i =0;i<arr.length;i++) {
			total += arr[i]; // 배열의 값을 불러와 total에 합산
		}
		System.out.println(total);
	}

}
