package kr.co.tj;

public class NestedLoopTest_GuGuDan_Label_continue {

	public static void main(String[] args) {
		int dan =2;
		int count=1;
		
		aaa: for(dan=2;dan<=9;dan++) { // 밖의 for가 X축(횡), 내부는 y축(세로).
			 for(count=1;count<=9;count++) {
				// if(dan==3) break; // 3단 제한
				if(count==5) continue aaa; // goto
				System.out.print(dan+ "X" + count + "=" + dan * count + " "); // 가로로 한줄로 찍기
			}
			System.out.println();
		}
	}

}
