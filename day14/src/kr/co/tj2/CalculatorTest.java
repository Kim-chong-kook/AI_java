package kr.co.tj2;

interface Calc {
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
// 추상객체의 상속받음 
abstract class Calculator extends Object implements Calc{ // extends Object 생략가능

	@Override //////////////// 다형성만 접근가능
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	
}
// 일반객체의 추가적인 2차 상속 
class CompleteCalc extends Calculator {

	@Override //////////////// 다형성만 접근가능
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if( num2 == 0 )
			return ERROR;
		else 
			return num1 / num2;
	}
	
	public void showInfo() { // 이부분은 기능에서 빠지므로 다운캐스팅 해줘야만 호출된다.
		System.out.println("모두 구현하였습니다.");
	}
}

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = (Calc)new CompleteCalc(); // 업캐스팅[부모 = (부모)]
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "=" +calc.substract(num1, num2));
		System.out.println(num1 + "*" + num2 + "=" +calc.times(num1, num2));
		System.out.println(num1 + "/" + num2 + "=" +calc.divide(num1, num2));

		CompleteCalc cc = (CompleteCalc)calc; // 명시적 다운캐스팅해서 자손의 메소드를 사용한다.[자식 = (자식)]
		cc.showInfo();
	}



}
