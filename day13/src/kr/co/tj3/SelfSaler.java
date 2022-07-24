package kr.co.tj3;

//<< 에러제거 >>

//class Pay {//돈을 나타내는 클래스입니다.
//class Admin {//관리자 클래스시작
//class Drink{//자판기 음료클래스시작
//class Coffee extends Drink{//음료클래스에서 커피클래스로 상속받는다.
//class Soda extends Drink{//음료클래스에서 소다클래스로 상속받는다.
//class Ion extends Drink{//음료클래스에서 이온클래스로 상속받는다.

import java.util.Scanner;

import kr.co.tj4.Admin;
import kr.co.tj4.Coffee;
import kr.co.tj4.Drink;
import kr.co.tj4.Ion;
import kr.co.tj4.Juice;
import kr.co.tj4.Pay;
import kr.co.tj4.Soda;

public class SelfSaler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//키보드를 생성한다.
		Admin ad=new Admin(1234);//어드민 비밀번호설정
		Drink[] drink=new Drink[7];//음료클래스를 7개를 만든다.

		drink[0]=new Coffee("아메리카노", 10,1500);//아메리카노생성
		drink[1]=new Coffee("라떼 ", 10,1600);//라떼생성
		drink[2]=new Ion("파워에이드", 10,2000);//파워에이드생성
		drink[3]=new Juice("오렌지주스", 10,1400);//오렌지주스생성
		drink[4]=new Juice("포도주스 ", 10,1400);//포도주스생성
		drink[5]=new Soda("콜라 ", 10,2200);//콜라생성
		drink[6]=new Soda("사이다 ", 10,2000);//사이다생성

		while(true) {//반복문

		System.out.println("1.소비자 2.관리자 3.종료"); //소비자 관리자 종료를 사용자에게보여준다.
		int a = sc.nextInt();//키보드로 위에 프로토콜을 입력받는다.
		if(a==1) { //소비자모드
			System.out.println("돈을 얼마나 넣으시겠습니까?");//사용자로부터돈을 입력받는메시지
			Pay pay=new Pay(sc.nextInt());//키보드로 돈을 입력받아서 돈클래스에 입력한다.
			System.out.println(pay.money+"원을 넣으셨습니다.");//돈클래스에서입력받은돈을 가져와서 사용자에게 넣은액수를 알려준다.
			System.out.println();//줄바꿈
	
			while(true) {
				System.out.println("상품을 선택해주세요.");//상품을 선택해주세요 출력한다.
				for(int i=1;i-1<drink.length;i++) {//음료갯수만7개만큼입력한다.
					System.out.println(i+"."+drink[i-1]);//음료갯수에서 하나빼서0번지부터상품갯수7개에서 상품번호를 보여준다.
			
				}//상품을 선택해주세요 출력

				int act=sc.nextInt()-1;//act는 음료클래스의 배열방에서 음료이름을 꺼내기위한 변수
				int orders; //주문의 수량을 입력하는 변수
				if(act<0||act>=drink.length) {//음료클래스의 음료갯수의 유효성검사
					System.out.println("잘못된입력입니다.");
					System.out.println();
					continue;

				}//음료클래스의 음료갯수의 유효성검사

				System.out.println(drink[act].getName()+"을 선택하셨습니다.");///음료의 배열방에서 이름을 꺼내서 사용자에게 보여줌

				while(true) {//반복문

					System.out.println("수량을 입력하세요");//음료수량을 입력메시지
					orders=sc.nextInt();//음료갯수를 키보드로 받아들인다.

					if(orders<=0) {//음료주문한 갯수가 음수면 잘못(유효성검사)

						continue;//반복문으로 올라감
					}//음료주문한 갯수가 음수면 잘못(유효성검사)

					break;//반복문탈출
				}//반복문
				
				pay.pay(drink[act], orders);//돈클래스에서 PAY함수에 음료번호와 주문한음료갯수를 돈함수에 보낸다.
				System.out.println("주문을 계속하시겠습니까? Y/N");//주문을 계속Y/N
				String YN=sc.next();//키보드로 주문한 문자를 입력받는다.
				YN=YN.toUpperCase();//소문자로 입력한 문자를 대문자로 바꾼다. 
				if(YN.equals("N")) {//입력한값이 N이면 반복문을 탈출하고 
					break;//탈출한다.
				}//입력한 값이 N이면
			}//반복문끝
			}//소비자모드
			else if(a==2) {//관리자모드
				while(true) {//반복문
					System.out.println("관리자 비밀번호를 입력하세요.");//관리자비밀번호입력메시지
					if(ad.checkPW(sc.nextInt())) {//관리자객체에서 사용자가 입력한 패스워드와 같은지를 체크하는 함수를 수행한다.

						while(true) {//반복문

							System.out.println();//줄바꿈
							System.out.println("1.물품목록 2.물품수량추가 3.관리자모드 종료");//물품목록,물품수량추가,관리자모드,종료프로토콜설정
							int gmact=sc.nextInt();//키보드로 프로토콜입력
							if(gmact==1) {//프로토콜이 물품목록이면
								for(int i=1;i-1<drink.length;i++) {//음료반복문
									System.out.println(i+"."+drink[i-1]);//음료0번지부터7개의목록을 보여준다.
								}//음료반복문끝 

							}//프로토콜이 물품목록이면

							else if(gmact==2) {//프로토콜이 물품수량추가

								while(true) {//반복문
									for(int i=1;i-1<drink.length;i++) {//음료반복문물품수량추가한반복문
										System.out.println(i+"."+drink[i-1]);//음료0번지부터7개의목록을 보여준다.

									}//음료반복문물품수량추가한반복문
									System.out.println("추가할 물품은 선택해주세요.");//추가할물품을 선택해 주세요
									int act=sc.nextInt()-1;//키보드로 음료배열방을 입력받는다.
									int gmorders;//물품추가를 정수로 입력받는다.
									if(act<0||act>drink.length) {//음료배열방유효성검사
										System.out.println("잘못된입력입니다.");//잘못된입력입니다.음수입력불가
										System.out.println();//줄바꿈
										continue;//반복문으로 올라간다.
									}//음료배열방유효성검사
									System.out.println(drink[act].getName()+"을 선택하셨습니다.");//음료배열방에서선택한음료의이름을꺼내서소비자에게알려줌 
									while(true) {//반복문
										System.out.println("수량을 입력해주세요");//수량을 입력하세요
										gmorders=sc.nextInt();//키보드로 추가물품갯수를 입력
										if(gmorders<=0) {//추가물품의 유효성검사
											System.out.println("잘못된입력입니다.");//잘못된입력음수입력불가
											continue;//반복문으로 올라감
										}//추가물품의 유효성검사
										break;//반복문탈출 
									}//반복문
									ad.plusCnt(drink[act], gmorders);//관리자물품추가함수를 소비자가입력한숫자를 음료배열방에 입력하고 추가물품갯수를 입력한다.
									System.out.println(drink[act].getName()+"의 수량을 "+gmorders+"개 추가하였습니다.");
									//소비자가 선택한 음료의 이름을 보여주고 추가물품갯수를 보여준다.
									break;//탈출한다.
								}// 반복문
							}//프로토콜의 물품수량추가
							else if(gmact==3) {//관리자모드종료
								System.out.println("관리자모드를 종료하겠습니다.");//종료메시지출력
								break;//탈출
							}//관리자모드종료
							else 
								continue;
						}//반복문
						break;
					}//관리자객체에서 사용자가 입력한 패스워드와 같은지를 체크하는 함수를 수행한다.
					else {//관리자객체에서 사용자가 입력한 패스워드가 다른지를 체크하는 시작
						System.out.println("잘못입력 하셨습니다.");//잘못입력
						System.out.println("다시입력하시겠습니까? Y/N"); //y와n만 입력된다는 전제하에
						String YN=sc.next();//키보드로 재입력한다.
						YN=YN.toUpperCase();//소문자를 대문자로 바꾼다.
						if(YN.equals("N")) {//입력한 문자가 N와 같으면 
							break;//반복문 탈출
						}//입력한 문자가 N와 같으면 

					}//관리자객체에서 사용자가 입력한 패스워드가 다른지를 체크하는 시작

				}//반복문

			}//관리자모드

			else if(a==3) {//종료모드

				break;//탈출

			}//종료모드

			else {//잘못된 입력

				System.out.println("잘못된 입력입니다.");//잘못된입력
				System.out.println("다시입력하시겠습니까? Y/N");//다시입력
				String YN=sc.next();//키보드입력
				YN=YN.toUpperCase();//소문자를 대문자로 변환
				if(YN.equals("N")) {//N이면
					break;//반복문탈출
				}//N이면
				continue;//반복문으로 올라감
			}//잘못된입력
		}//반복문
		System.out.println("종료되었습니다.");
	}//메인의끝
}//클래스의 끝

