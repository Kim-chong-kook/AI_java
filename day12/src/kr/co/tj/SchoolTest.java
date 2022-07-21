package kr.co.tj;

// 오버라이팅 : 다형성

class School extends Object{
	int kor;
	int eng;
	int mat;
	/**
	@Override // ★★★ 기본정보 호출 toString()을 재정의/덮어쓰기 한다.
	public String toString() { // 재정의 한 toString()
		return "School [kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}*/
}

public class SchoolTest {
	public static void main(String[] args) {
		School school = new School();
		System.out.println(school.toString()); // 정보 / 오버라이딩 전에는 메모리 정보
		System.out.println(school); // 정보
	}
}
