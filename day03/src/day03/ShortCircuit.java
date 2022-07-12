package day03;

public class ShortCircuit { // 컴파일러가 읽어 처리했는지 확인로직.

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) < 10 ) && ( (i = i + 2) < 10 );
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // && 앞부분 false이기때문에, 뒷부분을 컴파일러가 읽지 않는다.
		
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

	}

}
