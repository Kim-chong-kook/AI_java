package kr.co.tj;

class Customer {
	protected int customerID; // protected는 상속매개
	protected String customerName;// protected는 상속매개
	protected String customerGrade;// protected는 상속매개
	int bonusPoint;
	double bonusRatio;
	
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
	
	public VIPCustomer(int customerID, String customerName) { // String customerGrade를 customerName으로 정상화함.
		super(customerID, customerName); // 
		customerGrade = "VIP"; // customerName이 정상화되어 customerGrade에 이름이 들어가지 않게 했고, Grade도 this를 넣을 필요없고 VIP로 나왔다.
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, String) 생성자 호출");
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
		return customerName + "님의 등급은 " + customerGrade + 
					"이며, 보너스 포인트는" + bonusPoint + "입니다";
	}
}

public class Override_CustomerTest_added {  ////////////////////////// 이것도 하나의 클래스 이므로 ()불필요함.
	public static void main(String[] args) { ////////// 메소드만 () 필요함.
		//Customer customerLee = new Customer(); // 매개변수 없는 것은 만들지 않았기에 에러난다.
		
		Customer customerLee = new Customer(10010, "이순신");
		//customerLee.setCustomerName("이순신");
		//customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
			
			
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신"); // 상속받은 것부터 실행.
		//customerKim.setCustomerName("김유신");
		//customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		/** 클래스를 모를경우 작성할 추가코드
		if(customerGrade == "SILVER") {
		}else if(customerGrade == "VIP") {
		}*/
		
		int priceLee = customerLee.calcPrice(10000); // 가격 1만원 구매
		int priceKim = customerKim.calcPrice(10000); // 가격 1만원 구매
		
		System.out.println();
		System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");		
		
		Customer customerNo = new VIPCustomer(10030, "나몰라"); // ★ 업캐스팅
		// 묵시적 무명자 생성해서 넣음 : Anonymouse anonymoune = new VIPCustomer();
		// 묵시적 형변환 Customer customerNo = (Customer) new VIPCustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		int priceNo = customerNo.calcPrice(10000); // 부모로 up casting되었지만, 자식에서 ★ Override된 것이 우선적 실행된다(부모것은 virtual로 가려진다).
		System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo  + "원 입니다.");
		
		// ■ customerNo.에서 확인하면, 다형성으로써, 자식에 부모의 메소드를 Override한 부분은 부모클래스로 표식되나 virtual로 가려지고, 실제는 자신(자식)의 부분이 우선 실행된다. 

	}

}