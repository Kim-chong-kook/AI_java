package kr.co.tj;

public class Test2_witch_case {

	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
		
			case "Gold": case "gold": // 공동의 결과를 가짐: 대소문자입력이 있을경우 붙여서 쓴다.
				System.out.println("금메달 입니다.");
				break;
			case "Silver": case "silver":
				System.out.println("은메달 입니다.");
				break;
			case "Bronze": case "bronze":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				break;
		}


	}

}
