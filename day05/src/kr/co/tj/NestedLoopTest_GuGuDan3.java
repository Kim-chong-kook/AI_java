package kr.co.tj;

public class NestedLoopTest_GuGuDan3 {

	public static void main(String[] args) { // 가로로 찍기.
		int dan =2;
		int count=1;
		
		for(dan=2;dan<=9;dan++) { // 밖의 for가 X축(횡), 내부는 y축(세로).
			for(count=1;count<=9;count++) {
				
				System.out.print(count+ "X" + dan + "=" + dan * count + " "); // 가로로 한줄로 찍기
			}
			System.out.println();
		}
	}

}
