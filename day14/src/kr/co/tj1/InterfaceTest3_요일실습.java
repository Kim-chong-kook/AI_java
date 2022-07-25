package kr.co.tj1;

interface Days{ // public 삭제해둠
	
    public static final int SUNDAY = 1, MONDAY = 2, TUESDAY = 3,
      WEDNESDAY = 4, THURSDAY =5, FRIDAY =6, SATURDAY = 7;
}

class DayTest extends Object implements Days{
	
}

public class InterfaceTest3_요일실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayTest dayTest = new DayTest();
		System.out.println(dayTest.SUNDAY); // 객체 생성해서 불러왔기에 [경고등]
		System.out.println(Days.SUNDAY); // 클래스 소속이기 때문에 바로 불러올 수 있다.(상속 불필요)
	}

}
