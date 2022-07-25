package kr.co.tj3;

interface Sell{
	void sell();

}
interface Buy{
	void buy();
}

class Customer extends Object implements Buy,Sell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("판다.");
		
	}
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("산다.");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
}
public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayHello();
		
		Buy buyer = customer; // (Buy) customer 업캐스팅 // 업캐스팅은 묵시적
		buyer.buy();
		
		Sell seller = customer; // (Buy) customer 업캐스팅 // 업캐스팅은 묵시적 // 다운은 명시적으로 해준다.
		seller.sell();
	}
}
