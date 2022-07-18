package kr.co.tj2;

class Employee{
	private  String name;
	private double salary;
	private static int count =0; // 정적 변수 사용 조건
	
	public Employee() {
		
	}
	public Employee(String n, double s) {
		name = n;
		salary =s;
		count++; // 정적변수 count 증가
	}
	// 객체가 소멸될때 호출
	protected void finalize() { // ★★★ e1,e2,e3가 필요없다고 판단되면 jvm이 자동으로 호출한다.
		count--; // 직원이 하나 줄어들어 감소
	}
	public static int getCount() {
		return count;
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("정명호", 35000.0);
		Employee e2 = new Employee("김승석", 50000.0);
		Employee e3 = new Employee("박천수", 20000.0);
		
		int n = Employee.getCount();
		System.out.println("현재 직원수 = "+n);
				
		

	}

}
