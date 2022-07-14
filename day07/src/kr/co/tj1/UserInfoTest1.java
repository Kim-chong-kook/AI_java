package kr.co.tj1;

class UserInfo{
	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {}
	
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	public String showUserInfo() {
		return "고객님의 아이디는 "+ userId+ "이고, 등록된 이름은"+userName+ "입니다.";
	}
}



//======클라이언트 class = 파일명
public class UserInfoTest1 {

		public static void main(String[] args) {
			
			// === 회원1
			UserInfo userLee = new UserInfo(); // 디폴트 오버라이딩으로 입력됨
			userLee.userId="a12345";
			userLee.userPassWord = "zxcvbn12345";
			userLee.userName = "Lee";
			userLee.phoneNumber = "01034556699";
			userLee.userAddress = "Seoul, Korea";
			
			System.out.println(userLee.showUserInfo());
			
			//=== 회원2
			UserInfo userKim = new UserInfo("b12345","09734556baad","Kim"); // 세부 오버라이딩으로 입력됨.
			System.out.println(userKim.showUserInfo());
			
			//=== 회원3 // ★★★ 오버라이딩 내용이 넘쳐서 에러나는 상태다.
			//UserInfo userKimch = new UserInfo("b12345","09734556baad","Kimch","01245789","디지털로");
			//System.out.println(userKimch.showUserInfo());

			
		}
}
