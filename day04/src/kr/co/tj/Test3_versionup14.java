package kr.co.tj;

import java.util.Scanner;

public class Test3_versionup14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String medal="no";
		System.out.println("메달을 입력해주세요");
		medal = scan.next();
		switch(medal) {
			case "Gold": case "gold":
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
		}
	}

}
