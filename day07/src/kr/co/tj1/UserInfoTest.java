package kr.co.tj1;

import java.util.Scanner;

class UserInfo1{
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	int phoneNumber;
	Scanner scan = new Scanner(System.in);
	
	public UserInfo1() { //오버로드(개발관점)
	}
	public UserInfo1(String userId,String userPassWord,String userName) { // 지역변수로만 쓰이고 말지만, 소통문제로 위와 정확히 맞추는 것이 좋다.
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	public UserInfo1(String userId,String userPassWord,String userName,String userAddress) { //오버로드
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	public UserInfo1(String userId,String userPassWord,String userName,String userAddress, int phoneNumber) { //오버로드
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
		
	public String setUserId() { // public void setUserId(String userId) { // String / void 선택됨
		System.out.println("아이디입력:");
		this.userId = scan.next();
		return userId;
	}
	public String setUserPassWord() {
		System.out.println("패스워드입력:");
		this.userPassWord = scan.next();
		return userPassWord;
	}
	public String setUserName() {
		System.out.println("회원이름:");
		this.userName = scan.next();
		return userName;
	}
	public String setUserAddress() {
		System.out.println("주소입력:");
		this.userAddress = scan.next();
		return userAddress;
	}
	public int setPhoneNumber() {
		System.out.println("전화번호입력:");
		this.phoneNumber = scan.nextInt();
		return phoneNumber;
	}
	public void userInfoDisplay(int number) {
		if(number==1) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(number==2) {
			System.out.println("패스워드가 틀렸습니다.");
			
		}else {
			System.out.println("회원이십니다.");
			System.out.println(userId+":"+userPassWord+":"+userName+":"+userAddress+":"+phoneNumber);
		}
		
	}
	
}

//========================================================

public class UserInfoTest { // ★★★ 실행 진입점
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserInfo1 userInfo1 = new UserInfo1();
		String userId = userInfo1.setUserId();
		String userPassWord = userInfo1.setUserPassWord();
		String userName = userInfo1.setUserName();
		String userAddress = userInfo1.setUserAddress();
		int phoneNumber = userInfo1.setPhoneNumber();
		
		UserInfo1 userInfo2 = new UserInfo1(userId,userPassWord,userName,userAddress,phoneNumber);
		if(!userInfo2.userId.equals("Java")) {
			userInfo2.userInfoDisplay(1);
			
		}else if(!userInfo2.userPassWord.equals("1111")) {
			userInfo2.userInfoDisplay(2);
		}else {
			userInfo2.userInfoDisplay(3);
		}
		
				
	}
}
