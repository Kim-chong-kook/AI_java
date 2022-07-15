package kr.co.tj1;

class Student{ // 행위자 관점으로 시작.
	public String studentName;
	public int grade;
	public int money;
	//----생성자들
	public Student() {}
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	//----
	public void takeBus(Bus bus) { // 버스 탈때의 현상
		bus.take(1000);
		this.money-=1000;
	}
	public void takeSubway(Subway subway) { // 지하철 탈때의 현상
		subway.take(2800);
		this.money-=2800;
		
	}
	public void takeTaxi(Taxi taxi) { // 택시 탈때의 현상
		taxi.take(10000);
		this.money-=10000;
		
	}
	public void showInfo() {
		System.out.println(studentName+"님의 남은돈은"+money+"원 입니다");
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", grade=" + grade + ", money=" + money + "]";
	}
	
}

class Bus { // public class는 클라이언트 진입점 단1개 여야만 한다.//
	int busNumber;
	int passengerCount;
	int money;
	
	public void take(int money) {//승차정보 보여주는 것.....
		this.money += money;
		passengerCount++;
	}
	
	// 생성자
	public Bus() {} // Bus 객체를 아래에서 만들때는 new 문구를 써줘야 함
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	// 정보표현용 문구는 두가지 방식(show함수, toString()함수)
	@Override
	public String toString() { // studentJ의 개별정보 출력시 필요함.
		return "Bus [busNumber=" + busNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}
	public void showBusInfo() {
		System.out.println(busNumber+"번 버스의 승객은"+passengerCount+"명 이고, 수입은 " + money + "원 입니다");
	}
}

class Subway {
	public int lineNumber;
	public int passengerCount;
	public int money;
	
	public Subway() {} // Subway 객체를 아래에서 만들때는 new 문구를 써줘야 함.
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 정보표현용 문구는 두가지 방식(show함수, toString()함수)
    public void showSubwayInfo() {
    	System.out.println(lineNumber + "번 Green 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }
	@Override
	public String toString() {
		return "SubwayGreen [lineNumber=" + lineNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}
    
}

class Taxi {
	public String taxi운수회사;
	public int passengerCount;
	public int money;
	
	public Taxi() {} // Subway 객체를 아래에서 만들때는 new 문구를 써줘야 함.
	public Taxi(String taxi운수회사) {
		this.taxi운수회사 = taxi운수회사;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 정보표현용 문구는 두가지 방식(show함수, toString()함수)
    public void showTaxiInfo() {
    	System.out.println(taxi운수회사 + "택시의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }
	@Override
	public String toString() {
		return "Taxi [taxi운수회사=" + taxi운수회사 + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}
    
}

//========클라이언트==============
public class TakeTransTest_환승 {

	public static void main(String[] args) {
		
		// 학생 처음 상태 객체 생성
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentK = new Student("Kim",50000);
		Student studentE = new Student("Edward",20000);
		
		// 대중교통 객체 생성
		// class        //메소드
		Bus bus100 = new Bus(100); // 버스 번호객체 생성 및 선택
		// class        //메소드
		Subway subwayGreen = new Subway(2);// 지하철 번호객체 생성 및 선택
		Taxi taxiGold = new Taxi("8200");// 택시 번호객체 생성 및 선택
		Taxi wellTaxi = new Taxi("잘나간다");// 택시 번호객체 생성 및 선택
		
		// << 행동 개시 >>
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentK.takeTaxi(taxiGold);
		studentE.takeTaxi(wellTaxi);
		
		// 학생 행동 영향 정보1
		studentJ.showInfo();
		studentT.showInfo();
		studentK.showInfo();
		studentE.showInfo();
		
		// 대중교통의 영향 정보1
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();
		taxiGold.showTaxiInfo();
		wellTaxi.showTaxiInfo();
		
		// 학생 행동 영향 정보2
		System.out.println(studentJ.toString()); // 개별정보는 toString에서 가져오며, toString은 생략가능
		System.out.println(studentT);
		System.out.println(studentK);
		System.out.println(studentE);
		// 대중교통의 영향 정보2
		System.out.println(bus100);
		System.out.println(subwayGreen);
		System.out.println(taxiGold);
		System.out.println(wellTaxi);
	}


}

