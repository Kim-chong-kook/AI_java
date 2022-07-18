package kr.co.tj2;

class Time{ // 유효성검사 필요함...............
	private int hour;//0~23
	private int minute;//0~59
	private int second;//0~59
	public Time() {
		this(0,0,0); // 초기화 무관함.
	}
	public Time(int h, int m, int s) {
		setTime(h,m,s);
	}
	// 시간 설정 함수 유효성검사 1회로 하는 사례. // set에서 유효성 검사 / get에서 가져와서 출력
	// 일회성 함수는 main에서 new로 변수당 한번만 사용할 수 있고,
	// set/get을 사용하면, set/get 메소드를 활용해 여러번 반복해서 사용할 수 있다.
	public void setTime(int h, int m, int s) {
		if(h>=0 && h<24) {
			this.hour=h; // this사용
		}else {
			this.hour=0;
		}//시간검증
		if(m>0 && m<=60) {
			minute=m; // this 미사용
		}else {
			minute=0;
		}//분검증
		if(s>=0 && s<60) {
			second = s;
		}else {
			second = 0;
		}//초검증
	}
	public String printTime() {
		// return hour+":"+minute+":"+second+":";
		return String.format("%02d:%02d:%02d:", hour,minute,second);
	}
}
public class TimeTest {

	public static void main(String[] args) {
		Time time = new Time(); 
		System.out.println("기본생성자 호출후 시간:");
		System.out.println(time.printTime());
		
		Time time2 = new Time(13,27,6); 
		System.out.println("두번째 생성자 호출후 시간:");
		System.out.println(time2.printTime());
		
		Time time3 = new Time(99,66,77);
		System.out.println("올바르지 않은 시간 호출후 시간:");
		System.out.println(time3.printTime());
		
		//set(유효성 검사)/get을 사용하면 반복해서 값을 주고 .get할 수 있다.

	}

}
