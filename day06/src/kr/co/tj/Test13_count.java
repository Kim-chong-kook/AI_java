package kr.co.tj;

public class Test13_count {

	public static void main(String[] args) {
		double[] dArr = new double[5];
		
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		
		double mtotal = 1;
		for(int i=0;i<dArr.length;i++) { // 방의 갯수와 요소 개수가 차이가 있으면, 계산 불가
			mtotal*=dArr[i];
		}
		System.out.println(mtotal);
		
		// ==================== 올바른 사례=======
		double[] dArr1 = new double[5];
		int count = 0;
		dArr1[0] = 1.1; count++; // 별도의 카운팅 변수 필요할 수도.
		dArr1[1] = 2.1; count++;
		dArr1[2] = 3.1; count++;
		
		double mtotal1= 1;
		for(int i=0;i<count;i++) { // 방의 갯수와 요소 개수가 차이가 있어 계산 불가
			mtotal1*=dArr1[i];
		}
		System.out.println(mtotal1);
		
	}
	

}
