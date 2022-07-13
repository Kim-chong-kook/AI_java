package kr.co.tj;

public class Test5_4X3_array {

	public static void main(String[] args) {
		int[][] numArray = {{0,1,2},{0,1,2},{0,1,2},{0,1,2}};
		//[0][0]=0, [0][1]=1, [0][2]=2
		//[1][0]=0, [1][1]=1, [2][2]=2
		//[2][0]=0, [2][1]=1, [2][2]=2
		//[3][0]=0, [3][1]=1, [3][2]=2
		
		// 다차원 배열은 for for 사용
		for(int i=0;i<numArray.length;i++) { // 1차원 행배열의 갯수
			for(int j=0;j<numArray[j].length;j++) { //2차원 열배열의 갯수 i든, j든
				System.out.print(numArray[i][j]);
			}
		}
	}

}
