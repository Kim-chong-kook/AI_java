package kr.co.tj;

/** 알람시계는 현재시간과 알람클럭의 클래스를 가져야 한다.
 * 
 * @author TJ
 *
 */

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time() { // 기본생성자
		this(0,0,0); // 아래 생성자의 것을 초기화
	}
	public Time(int hour, int minute, int second) { //생성자
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public String getTime() { // 출력문
		//System.out.print("시간:"+hour+"분:"+minute+"초"+second);
		return "시간:"+hour+"시:"+minute+"분:"+second+"초";
	}
}
class AlarmClock{ // 클래스 마다 생성자 함수
	private Time currentTime;
	private Time alarmTime;
	
	public AlarmClock() { // 기본생성자
	}
	public AlarmClock(Time a, Time c) {
		alarmTime = a;
		currentTime = c;
	}
	public void printAlarm() { // 출력문
		System.out.println("알람시간:"+alarmTime.getTime()); //객체.함수
		System.out.println("현재시간:"+currentTime.getTime());//객체.함수
	}
}
//=======================
public class AlarmClockTest {
	public static void main(String[] args) {
		Time alarm = new Time(6,0,0);
		Time current = new Time(10,21,56);
		AlarmClock c = new AlarmClock(alarm,current);
		System.out.println(c); // c는 주소값만 가진다.
		c.printAlarm();
	}
}
