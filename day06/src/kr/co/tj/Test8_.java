package kr.co.tj;

import java.util.Scanner;

public class Test8_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[2];
		System.out.println("숫자입력:");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
			System.out.println(arr[i]);
		}
	}

}
