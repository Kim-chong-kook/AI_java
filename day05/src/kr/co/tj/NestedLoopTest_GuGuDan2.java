package kr.co.tj;

public class NestedLoopTest_GuGuDan2 {

	public static void main(String[] args) {
		int dan =2;
		int count=1;
		
		for(dan=2;dan<=9;dan++) { // 밖의 for가 X축(횡), 내부는 y축(세로).
			for(count=1;count<=9;count++) {
				System.out.println(dan+ "X" + count + "=" + dan * count); // 줄바뀜
			}
			System.out.println(); // 줄띄기
		}
	}

}

