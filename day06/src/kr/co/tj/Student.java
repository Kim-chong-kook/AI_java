package kr.co.tj;

public class Student { // -- 학생 클래스
	// @@@@ 객체라고 부르고, 메모리에선 인스턴스화 한다.@@@@@@@
	public int studentID; //--각기 메모리 할당. 초기값 0
	public String studentName; //--각기 메모리 할당. 초기값 null
	public String address; //--각기 메모리 할당. 초기값 null
	
	public void showStrudentInfo() {
		System.out.println(studentName+","+address);
	}
	public String getStrudentName() {
		return studentName;
	}
}
