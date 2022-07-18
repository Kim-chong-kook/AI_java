package kr.co.tj3;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6,7}};
		int i,j;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" "); 
				// 각 원소의 내용 // 기본 객체 이기 때문에 배열의 내용은 = 값
				// 만일 참조객체라면 주소를 나타낸다.
			}
			System.out.println(",\t"+arr[i].length); // 각 행의 갯수
			System.out.println();
		}

	}

}
