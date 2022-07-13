package kr.co.tj;

public class Test1_array_address { // 주소는 4byte = 32bit = 32억~-32억 충분한 용량이다.
	
	public static void main(String[] args) {
		int a=10; // a 정수형
		//int[] arr; // int[] 정수형(주소)을 가르키는 배열타입 : 자동초기화 null.
		//arr = new int[3]; // 배열을 0으로 초기화 하고, 주소를 가진다(0과 주소를 갖는다.)
		
		int[] arr = new int[3]; // ● 배열선언과 초기화 한번에.
		System.out.printf("배열의 길이%d\n",arr.length); // .length는 멤버변수.
		arr[0]=1;
		arr[1]='A';
		//arr[2]=1.5; // 할당불가
		System.out.printf("arr의 첫번째 공간:%d\n",arr[0]);
		System.out.printf("arr의 두번째 공간:%d\n",arr[1]);
		System.out.printf("arr의 두번째 공간:%d\n",arr[2]);
		
				
		
	}

}
