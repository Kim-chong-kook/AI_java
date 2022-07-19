package kr.co.tj;

/** 스트링 포맷
 * 
 * @author TJ
 *
 */
class Person{
	private String lastName;
	private String firstName;
	
	// 생성자
	public Person() {
		this("no","no");
	}
	public Person(String lastName,String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	// get만,
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String bulidName() { // 출력을 위한 메소드 제작
		return String.format("성=%s\n이름=%s\n", this.getLastName(),getFirstName());
		// ★ ★ ★ String.format 방식
	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("더","좋은");
		System.out.println(person.bulidName()); // 객체.함수()
	}
}
