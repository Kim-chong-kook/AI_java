package kr.co.tj;

public class Test6_Array_Active_Define {

	public static void main(String[] args) {
		int a = 10;
		int[] arr1 = new int[4];
		
		// 다차원 배열선언, 동적선언 가능.
		int[][] arr2 = new int[2][]; // 2개의 행만 선언
		arr2[0] = new int[4]; // 4개의 열
		arr2[1] = new int[2]; // 2개의 열
		arr2[1][1] = 100;
		for(int i = 0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]);
			}
		}
	}

}
