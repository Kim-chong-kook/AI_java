package kr.co.tj1;

class Employee{
	public static int serialNum; // C적인 문법
	static { // 선언 및 초기화		// 자바적 문법
		serialNum = 1000;
	}
	public Employee() { // 이름이 같으면 생성자.
		serialNum++; // 생성자 안에서는 초기화 하지 않는다. // 중복되지 않는 사원번호를 부여한다.
		employeeId = serialNum;
		employeeName = null;
		department = null;
	}
	private int employeeId;
	private String employeeName;
	private String department;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}

//==============================
public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee(); // 생성순간 static 변수가 변동(증감) 한다.
		employeeLee.setEmployeeName("이순신");
		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee(); // 생성순간 static 변수가 변동(증감) 한다.
		employeeKim.setEmployeeName("김유신");
		//employeeKim.serialNum++;
		
		System.out.println(employeeKim.serialNum); // 공유된 static 변수여서 현재는 공통 값.
		System.out.println(employeeLee.serialNum); // 공유된 static 변수여서 현재는 공통 값.
		
		/*System.out.println(employeeLee.getEmployeeName()+","+employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName()+","+employeeKim.getEmployeeId());
		System.out.println(Employee.serialNum); // class 소속으로 호출
		System.out.println(employeeKim.serialNum); // 객체(인스턴스) 소속으로 호출... 경고등
		*/

	}
}
