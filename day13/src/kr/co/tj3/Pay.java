package kr.co.tj3;

import kr.co.tj4.Drink;

public class Pay {
	int money;
	public Pay(int money) {
		this.money = money; // TODO Auto-generated constructor stub
	}
	public void pay(Drink drink, int orders) {
		// TODO Auto-generated method stub
		// 돈이 모자랄때,// 수량차감,// 자기돈 차감,// 수량이 모자랄때//,  모든 조건이 아닐때,
		if(this.money <= orders * drink.price  ) {
			System.out.println(drink.name+"을 사기에는 금액이 부족합니다.");
		}
		if(drink.stock < orders) {
			System.out.println(drink.name+" 재고가 부족합니다.");
		}
				
		drink.setStock() -= drink.getstock() - orders; // 수량차감
		
		
		money -= (drink.getPrice() * orders); // 자기돈 차감 // private된 상태를 감안해서 객체.get한다.
	}

}
