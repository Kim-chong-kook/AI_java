package kr.co.tj1;

// 상속하고나면, 오버라이딩 선택

class Student implements Cloneable{
	private int studentId;
	private String studentName;
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public boolean equals(Object obj) { // equals 재정의 했음. 여러종류의 equals
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std =(Student)obj; // 다운캐스팅
			if(this.studentId == std.studentId) {
				return true;
			}else {
				return false;
			}
		}
		//return super.equals(obj); 불필요문장
		return false;// 다시 false로 돌려 놓는다.
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId; //super.hashCode();
	}
	
	
}
public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee; ///////////////////////// 얕은 복사.
		Student Park = new Student(100, "Park");
		
		System.out.println(Lee == Park); // 주소비교.
		System.out.println(Lee.equals(Park)); // ID 100을 비교. 같음.
		
		System.out.println("hashCode와 identityHashCode 해쉬값 비교 (4줄)");
		System.out.println("Override 하지 않으면 일치 / Override하면 다름");
		System.out.println(Lee.hashCode());
		System.out.println(Park.hashCode());
		System.out.println(System.identityHashCode(Lee));
		System.out.println(System.identityHashCode(Park));
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2)); //ID 비교 = 같은값
		System.out.println(i1.hashCode()); // 100 // 해쉬코드를 Override 시키면, 서로 해쉬값으로 나옴.
		
		System.out.println("해쉬"+System.identityHashCode(i1)); // 해쉬는 다른 값
		System.out.println("해쉬"+System.identityHashCode(i2));
		
		Student Lee3 = (Student)Lee.clone(); // 서로 깊은 복사.
		System.out.println(System.identityHashCode(Lee)); // 서로 다른값이다.
		System.out.println(System.identityHashCode(Lee3));
				
	}

}
