package kr.co.tj2;

class Date{
	private int year;
	private String month;
	private int day;
	public Date() {
		
	}
	public Date(int y, String m, int d) {
		year = y;
		month = m;
		day = d;
	}
	//특수목적의 생성자 함수
	public void setDate(int y, String m, int d) {
		year = y;
		month = m;
		day = d;
	}
	public void printDate() {
		System.out.println(year+"년"+month+"월"+day+"일");
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}
public class DateTest___Good {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		date.setDate(2022, "7", 18);
		date.printDate();
		
		date.setYear(1998);
		date.printDate();
		
	}

}
