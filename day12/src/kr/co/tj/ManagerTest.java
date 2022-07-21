package kr.co.tj;

class Employee{
	public String name; // 이름:공용멤버
	protected int RRN; // 주민번호:전용멤버 // 에러 해제위해 private를 protected
	protected int salary; // 월급:보호멤버
	String address; //주소:패키지 멤버(기본, 디폴트 메소드)
	
	public String toString() {
		return name+","+address+","+RRN+"."+salary;
	}
}
	
class Manager extends Employee {
	private int bonus;
	
    public void printSalary() {
         System.out.println(name+"(" + address+"):"+(salary + bonus));
    }
	
	public void printRRN() {
	System.out.println(RRN);
	} 
}



public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.printRRN();

	}

}
