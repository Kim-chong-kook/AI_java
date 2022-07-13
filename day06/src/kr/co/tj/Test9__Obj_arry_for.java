package kr.co.tj;

public class Test9__Obj_arry_for {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr1 = new int[] {1,2,3,4,5}; // 배열크기 적지않고 값을 넣으며 크기 지정됨.
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		String[] fruit = {"사과","포도","참외"}; // 변수선언 값넣기
		for(String str:fruit) { // for문 내에서 별도 str 객체 선언하고 fruit 불러왔다.
			System.out.println(str);
		}
		String[] fruit1 =new String[] {"사과","포도","참외"};
		for(String str:fruit1) {
			System.out.println(str);
		}
	}
}
