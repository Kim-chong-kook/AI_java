package kr.co.tj;

class MakeReport{ // ★ StringBuffer = 자체내장 class 함수 = String 보다 성능이 좋다.
	StringBuffer buffer = new StringBuffer(); // String의 메모리 낭비를 막으려 StringBuffer 사용.
	
	private String line = "=====================================\n";
	private String title =" 이름\t   주소\t\t 전화번호 \n";
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	private void generateBody() {
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork Us \t");
		buffer.append("010-7777-0987\n");
	}
	private void makeFooter() {
		buffer.append(line);
	}
	public String getReport() { // 비공개된 정보를 꺼내기 위해 String return.
		makeHeader(); // 각기 실행해서 buffer를 꺼내 쓴다.
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}

//========client==(메인 진입점)================
public class TestReport_StringBuffer {  // 비공개된 정보를 String return 받음.

	public static void main(String[] args) {
		MakeReport report = new MakeReport();
		String builder = report.getReport();
		
		System.out.println(builder);
	}

}
