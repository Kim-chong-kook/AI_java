package kr.co.tj1;

//문제2.======
class Order{
	public String orderNo;
	public String orderPhoneNumber;
	public String orderAddress;
	public long orderDate;
	public long orderTime;
	public int orderPrice;
	public String menuNo;
	
	// 생성자 2개
	public Order() {}
	
	public Order(String orderNo, String orderPhoneNumber, String orderAddress,long orderDate,long orderTime,int orderPrice,String menuNo) {
		this.orderNo = orderNo;
		this.orderPhoneNumber = orderPhoneNumber;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNo = menuNo;
	}
	/**
	public String showOrderInfo() {
		return "주문 접수 번호:"+ orderNo+ "주문 핸드폰 번호:"+orderPhoneNumber+ "주문 집 주소:"+orderAddress+"주문 날짜"+orderDate+"주문 시간:"+orderTime+"주문 가격:"+orderPrice+"메뉴 번호:"+menuNo;
	} */
	
	public void showOrderInfo() {
		System.out.println("주문접수번호:"+orderNo);
		System.out.println("주문핸드폰번호:"+orderPhoneNumber);
		System.out.println("주문집주소:"+orderAddress);
		System.out.println("주문날짜:"+orderDate);
		System.out.println("주문시간:"+orderTime);
		System.out.println("주문가격:"+orderPrice);
		System.out.println("주문번호:"+menuNo);
		System.out.println();
	}
}

//======클라이언트 class = 파일명===========
public class 객체구현2 {

		public static void main(String[] args) {
			
			// === 회원1
			Order order = new Order(); // 디폴트 오버라이딩으로 입력됨
			order.orderNo = "202011020003";
			order.orderPhoneNumber = "01025896536";
			order.orderAddress = "디지털로";
			order.orderDate = 20201102;
			order.showOrderInfo();

			//=== 회원2==== 임의 오버라이딩으로 입력함
			Order order2 = new Order("202011020003","01025896536","디지털로", 20201102,130258,35000,"0003"); // 세부 오버라이딩으로 입력됨.
			order2.showOrderInfo();
			
			//=== 회원3 // ★★★ 오버라이딩 내용이 넘쳐서 에러나는 상태다.
	

			
		}
}
