package kr.co.tj_1;

public class Testing8 {

	public static void main(String[] args) {
		
		int i=0,j=0;
		for(i=1;i<=3;i++) { //3행 /3줄
			for(j=1;j<=i;j++) { // 찍는 수량은 i수량 만큼 j를 컨트롤
				//System.out.println("*");
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		for(i=3;i>=1;i--) { //3행 3줄
			for(j=1;j<=i;j++) { // 찍는 수량은 i수량 만큼 j를 컨트롤
				//System.out.println("*");
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
