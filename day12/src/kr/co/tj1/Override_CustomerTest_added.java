package kr.co.tj1;

import java.util.ArrayList;

class Customer {
	protected int customerID; // protected는 상속매개
	protected String customerName;// protected는 상속매개
	protected String customerGrade;// protected는 상속매개
	int bonusPoint;
	double bonusRatio;
	int agentID;
	
	/**
	public Customer() { //////////////////// 아래에서 제어하므로 불필요하다.
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}*/
	
	public Customer(int customerID, String customerName ) { //  ★ ★ ★ 상속되지 않고 제외된다.
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public Customer(int customerID, String customerName, int agentID ) { //  ★ ★ ★ 상속되지 않고 제외된다.
		this.customerID = customerID;
		this.customerName = customerName;
		this.agentID = agentID; 
	} ///////////////////★★★★★★★★★★★★★★★★★★★★
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
					"이며, 보너스 포인트는" + bonusPoint + "입니다";
	}
	
	//get/setter
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
}

class VIPCustomer extends Customer{ 
	// ★ extends = 다운 캐스팅 // 상속받았기 때문에 하위 메소드에서는 super(...)를 자동호출함.
	// (상위 메서드, 멤버변수에 접근)
	private int agentID; // 전문상담사
	double salesRatio; // 할인율
	
	/**
	public VIPCustomer() { //////////아래에서 컨트롤 하므로 불필요 하다.
		customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	*/
	
	public VIPCustomer(int customerID, String customerName, int agentID) { 
		super(customerID, customerName); // 
		customerGrade = "VIP"; // customerName이 정상화되어 customerGrade에 이름이 들어가지 않게 했고, Grade도 this를 넣을 필요없고 VIP로 나왔다.
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, String) 생성자 호출");
		this.agentID = agentID;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override //  ★ ★ ★ 이것이 상속함(인스턴스들)의 다형성 갖는 부분이다. // 오버로딩은 단일 객체에서만 쓰는 방식이다.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는" + agentID + "입니다";
	}
}

class GoldCustomer extends Customer{ 
	// ★ extends = 다운 캐스팅 // 상속받았기 때문에 하위 메소드에서는 super(...)를 자동호출함.
	// (상위 메서드, 멤버변수에 접근)
	private int agentID; // 전문상담사
	double salesRatio; // 할인율
	
	/**
	public GoldCustomer() { //////////아래에서 컨트롤 하므로 불필요 하다.
		customerGrade = "GOLD";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	*/
	
	public GoldCustomer(int customerID, String customerName) { // String customerGrade를 customerName으로 정상화함.
		super(customerID, customerName); // 
		customerGrade = "GOLD"; // customerName이 정상화되어 customerGrade에 이름이 들어가지 않게 했고, Grade도 this를 넣을 필요없고 VIP로 나왔다.
		bonusRatio = 0.02;
		salesRatio = 0.1;
		System.out.println("GOLDCustomer(int, String) 생성자 호출");
	}
	
	@Override //  ★ ★ ★ 이것이 상속함(인스턴스들)의 다형성 갖는 부분이다. // 오버로딩은 단일 객체에서만 쓰는 방식이다.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
					"이며, 보너스 포인트는" + bonusPoint + "입니다";
	}
}

//===========================================================================
public class Override_CustomerTest_added {  ////////////////////////// 이것도 하나의 클래스 이므로 ()불필요함.
	public static void main(String[] args) { ////////// 메소드만 () 필요함.

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("====== 고객 정보 출력 =======");
		
		for( Customer customer : customerList){
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 =======");
		
		int price = 10000;
		for( Customer customer : customerList){
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() +" 님이 " +  + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}

	}
}