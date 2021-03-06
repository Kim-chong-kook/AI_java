package kr.co.tj;

public class Test {
	public static void main(String[] args) {
		// jdk 8이 안정적, 11도 괜찮음. jdk 11 압축파일[orcle.com 로그인]
		// 윈도우 환경변수 path에 bin까지 한번만 입력.
		// 이클립스.zip 압축파일로 가져와 폴더에서 실행.
		
		
		// package 생성 : 좌측 src 우클릭 / (디폴트 package를 사용하면 정리가 꽝이므로), new / package 생성,
		// 회사도메인 꺼꾸로 써서 페키지를 정렬.
		// 폰트설정 : windows / preference / font 검색.. text font에서 변경.
		
		// <<단축키>>
		// main 등 문법용어 쓰고 : 컨트롤 + spacebar로 자동완성
		// 블럭 & 컨트롤 + 쉬프트 + F : 자동정렬
		// 블럭 & 컨트롤 + 알트 + 하방키 : 복사
		// 컨트롤 + F11 : 실행
		
		// 우측 돋보기 검색창 옆의 java EE / java 클릭시 : 좌측의 [Package Explorer / Project Explorer]
		// 이름 변경됨.
		// 이클립스 컴파일러 버전을 java 버전과 일치하게 교체 : javaSE-17 --> 11 : 좌측 JRE System Library
		// 우클릭/ properties에서 교체함.

		// api doc 설명은 영어 : 교재가 한글
		// <<한글깨짐 문제 해결방안>>
		// 윈도우/환경/제너럴/워크스페이스/other UTF-8이어야 한글이 깨지지 않는다. 팀프로젝트시 중요함 ■
		// 윈도우/환경/web/Html 및 JSP 2개소 /utf-8로 교체해준다.
		// 이것을 한번에 해주는 방법 :
		// D:\DEVELOP\eclipse-jee-2022-06-R-win32-x86_64\eclipse\eclipse.ini 파일에
		// -Dfile.encoding=utf-8 라인을 추가함.
		
		// src 폴더 아래에 java 코딩파일, bin 폴더 아래에 컴파일링 파일이 존재한다. [.class]는 기계어로 변환된 컴파일 파일이다. 
		// 디버그 화면 : 벌레모양 클릭. 실행과 협력됨.
		// 자바는 실행파일1개와 가상머신(윈도우즈,리눅스)을 활용해 실행하여 간편 // C언어는 컴파일러(윈도우즈, 리눅스)를 통해 실행파일이 각각생성 유지보수 불편.
		
		// <<단축키>>
		// 블럭잡고 Tab : 우측으로 이동
		// 블럭잡고 shift + Tab : 좌측으로 이동
		// 블럭잡고 Ctrl + shift + F : 올바른 정렬
		
		// 자바는 객체지향 언어, C언어는 메모리를 포인터로 관리하기에 다운될 위험 많다. 그러나 java는 거의 다운되지 않는다.
		// 홈쇼핑도 객체, 택배회사 객체, 주문객체, 회원객체, 상품객체 상호간에 유기적인 협력, 실행을 통해 물건을 배송받는다.
		// 그래서 다운되지 않는 안정적인 java를 web에 사용한다.
		// 자료구조, 알고리즘에 관한 부분도 다루게 된다.
		// JRE는 압축파일이다. rt.jar 속에 lib class가 들어있다. 그 속에 라이브러리 클래스를 넣어 끌어다 쓴다.
		// jdk 컴파일, jvm도 jre통해 컴파일.... 윈도우에서 실행됨[주로 java 포함된 Eclipse를 활용한다. = 이클립스와 흡사한 모듈이 동일한 spring.io] 
		// 컴파일된 바이트 코드.class로 윈도우/리눅스에서 jvm을 돌려 사용.
		
		// Ctrl + N : 새로운 객체 생성.
		// project(모듈 생성은 해제함) / package 생성 / 클래스 생성
		
		System.out.println("java hello2");
		System.out.println("java hello3");
		System.out.println("한글모드자바 hello1");
		System.out.println("java hello2");
		System.out.println("java hello2");
		System.out.println("java hello2");

		// 16진수는 메모리 주소, 4byte.
		// long : 64bit, 8byte
		// 첫자리는 부호값
		// 0 0 0 0 0 1 0 1 : 불들어오면 2의 지수 확인
		// +         2 1 0 : 2의 지수
		// =         4 0 1 : 5값
		// 3자리로 표현할 수 있는 것은 8bit : 2의 3승
		// 문법의 시작은 main
		
		// <<정수표현 4가지>>
		//  8진수 3bit로 표현가능
		// 16진수 4bit로 표현가능 : 메모리 address표현 : 10진수 10 부터는 : 1~9 A B C D E F 10
		
		// byte  : 1byte, 8bit : 2의 단자 8승 : 256을 반으로 -128 ~ +127, 1개는 부호값
		// short : 2byte, 16bit: 2의 16승 65000을 반으로 쪼개어 -32000 ~ +32000
		// int   : 4byte, 32bit : 2의 32승 정수 숫자 기본형 42억 : -21억 ~ +21억
		// long  : 8byte, 64bit : 2의 64승
	}
}
