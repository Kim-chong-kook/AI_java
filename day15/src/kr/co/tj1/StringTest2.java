package kr.co.tj1;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); // 기존 주소
		
		java = java.concat(android); 
		// 새로운 문자열로 인식하고 합쳐진 곳으로 메모리가 연결되고 새로 생성됨[기존의 java 힙은 주소를 잃고 가비지 된다.] = 다량 발생가능. 
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); // 다른 주소
	}

}
