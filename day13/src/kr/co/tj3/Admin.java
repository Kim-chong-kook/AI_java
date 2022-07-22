package kr.co.tj3;

public class Admin {
	int passwd;
	public Admin(int passwd) {
		this.passwd = passwd; // TODO Auto-generated constructor stub
	}
	public boolean checkPW(int passwd) {
		// TODO Auto-generated method stub
		return (this.passwd == passwd);
	}
	public void plusCnt(Drink drink, int cnt) {
		// TODO Auto-generated method stub
		drink.stock += cnt;
	}

}
