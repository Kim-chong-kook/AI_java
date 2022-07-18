package kr.co.tj3;

import java.util.Calendar;
 // 1개의 값에서 복사해감(메모리 절감, 비용절감, 노력절감, 헷갈림 방지, 유일한 회사명 등등).
 // 싱글톤 연습으로 회사 객체 구현

class Company{
	private static Company instance = new Company();
	private Company() {
		
	}
	public static Company getInstance() { // static 이므로 회사가 만들어지지 않으므로, 일반함수를 만들어 객체 복사해 가져가도록함 = 싱글톤 패턴
		if(instance==null) {
			instance = new Company();
		}
		return instance;
	}
}

//================================================
public class CompanyTest_싱글톤패턴 {

	public static void main(String[] args) {
		Company c1 = Company.getInstance(); // 회사 객체를 만들지 않고 함수를 불렀음.
		Company c2 = Company.getInstance(); // 회사 객체를 만들지 않고 함수를 불렀음.
		System.out.println(c1); // 같은 주소값
		System.out.println(c2); // 같은 주소값

		Calendar calendar = Calendar.getInstance(); // 달력객체도 유일하게 한개이다. 싱글톤 패턴
		System.out.println(calendar);
	}

}
