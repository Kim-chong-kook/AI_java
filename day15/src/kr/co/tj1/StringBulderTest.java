package kr.co.tj1;

public class StringBulderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		//buffer = buffer.concat(android); // 버퍼에선 concat 명령어가 없다.
		System.out.println(System.identityHashCode(buffer)); // 같은 주소이므로 메모리 절약.
		java = buffer.toString();
				

	}

}
