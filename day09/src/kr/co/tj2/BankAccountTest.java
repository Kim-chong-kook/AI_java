package kr.co.tj2;

class BankAccount{ // 은행계좌
	private int balance;
	private String owner;
	private int accountNumber;
	public BankAccount() {
		//초기화 ...
	}
	public BankAccount(int accountNumber,String owner,int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(int amount) { // 저금
		balance += amount;
	}
	public void withdraw(int amount) {//인출
		balance -= amount;
	}
	public String print() {
		return "현재잔액은"+balance+"원입니다";
	}
	
}
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount myAccount =new BankAccount();
		myAccount.deposit(10000);
		System.out.println(myAccount.print());
		myAccount.withdraw(8000);
		System.out.println(myAccount.print());
	}

}
