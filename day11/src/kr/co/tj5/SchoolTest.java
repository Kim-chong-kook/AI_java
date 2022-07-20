package kr.co.tj5;

class School extends Object{
	protected int kor; // 상속을 위해서는 접근지정자로써, protected를 쓴다.
	protected int eng;
	protected int mat;
	/**
	public School() {
		super();
	}
	*/
	public School(int kor, int eng, int mat) { // 이것은 상속되지 않는다. 아래에 모두 기술함이 필요해진다..
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
}

class ManSchool extends School{
	public int gisul;
	public ManSchool(int k, int e, int m, int g) { // 위로가서 상속 초기화 받을 것과 자신의 변수포함해서 메소드 작성
		super(k,e,m); // 상속안되어 위로 가서 초기화를 얻어와야 한다.
		gisul = g;
	}
}

class WomanSchool extends School{
	public int gajong;
	public WomanSchool(int k, int e, int m, int g) {
		super(k,e,m);
		gajong = g;
	}
}

class ManGongupSchool extends ManSchool{
	public int gongup;
	public ManGongupSchool(int k,int e, int m, int g, int g1) {
		super(k,e,m,g);
		gongup = g1;
	}
}
class WomanSangupSchool extends WomanSchool{
	public int sangup;
	public WomanSangupSchool(int k,int e, int m, int g, int s) {
		super(k,e,m,g);
		sangup = s;
	}
}
//=======================================
public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
