package kr.co.tj;


class Box extends Object implements Comparable{
	
	private double volume = 0;
	public Box(double v) {
		volume = v;
	}
	
	// Box 에서 add 하면 프래임은 자동 추가되고, 크고 작음에 대한 if는 작성
	@Override
	public int compareTo(Object o) {
		Box other =(Box)o; // 형변환
		if(this.volume<other.volume) return -1;
		else if(this.volume>other.volume) return 1;
		else return 0;
	}
	
}
public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box(100);
		Box b2 = new Box(85.0);
		if(b1.compareTo(b2)>0) {
			System.out.println("b1이 b2 보다 크다.");
		}else {
			System.out.println("b1이 b2 보다 작거나 같다.");
		}

	}

}
