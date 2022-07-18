package kr.co.tj3;

class Employee{
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSrialNum(int serialNum) { 
		// static 메소드 특성은 static 변수만 쓸수있다. 아니면 class부터 불러야 함.
		int i=0;
		//employeeName = "Lee";// 오류발생
		Employee.serialNum = serialNum; ///////////////////////// 
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment(String department) {
		return department;
	}
}



//===============================================================
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmployeeName("이순신");
		e1.setDepartment("군인");
		System.out.println(Employee.getSerialNum());
		Employee.setSrialNum(1003);
		System.out.println(Employee.getSerialNum());
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getEmployeeName());

	}

}
