package kr.co.tj3;

public class Drink {
	String name;
	int stock;
	int price;
	public Drink(String name, int stock, int price) {
		
		this.name = name;
		this.stock = stock;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	@Override // 상품이 메모리 주소가 뜨므로 / 소스 toString 생성 
	public String toString() {
		return "Drink [name=" + name + ", stock=" + stock + ", price=" + price + "]";
	}
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
