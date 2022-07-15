package kr.co.tj;

class BirthDay{
	private int day; // 유효성검사 필요 : if else로
	private int month;
	private int year;
	private boolean isValid;
	
	//--------------------------------------------
	// 생성자들을 자동완성 시도함 : public BirthDay() {}
	
	public BirthDay() {
		super();
	}
	public BirthDay(int day, int month, int year, boolean isValid) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.isValid = isValid;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		// 유효성 검사
		if ( month < 1 || month > 12) {
			isValid = false;
		}
		else {
			this.month = month;
			isValid = true;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		String str = "";
		if(isValid) {
			str=year+"년"+month+"월"+day+"일입니다.";
		}else {
			str="유효하지 않은 날짜입니다.";
		}
		return str; // ★ return 2개는 컴파이러가 부담되므로 1개로 만든다.
		
		//return "BirthDay [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}

//===============================
public class BirthDayTest {
	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		
		date.setYear(2022);
		date.setMonth(77);
		date.setDay(10);
		
		System.out.println(date);
	}
}
