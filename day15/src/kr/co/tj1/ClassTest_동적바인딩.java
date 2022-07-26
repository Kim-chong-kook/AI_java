package kr.co.tj1;

//동적 바인딩 시험//////////////////////

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Person{

    private String name;
    private int age;
    public Person(){ }
    public Person(String name) {
    	this.name = name;
    }
    public Person(String name, int age){
             this.name = name;
             this.age = age; 
    }
    
    // 겟/셋터. 제너레이팅
   public String getName(){
      return name;
   }

   public void setName(String name){
      this.name = name;
   }
   public int getAge(){
      return age;
   }
   public void setAge(int age){
       this.age = age;
   }
   
   @Override // 제너레이팅
   public String toString( ){
      return "name = "+ name;
   }
}
    
public class ClassTest_동적바인딩 {

	public static <T> void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		
		
		Person person = new Person("James"); ///////////////////////////
		System.out.println(person);
		
		Class c1 = Class.forName("kr.co.tj1.Person");
		
		Person person1 = (Person)c1.newInstance(); //////// 객체 생성 안되었음..null.....^^
		System.out.println(person1); // toString 호출
		
		Class[] parameterTypes = {String.class};
		Constructor<T> cons = c1.getConstructor(parameterTypes); // 예외처리 많음
		
		Object[] initargs = {"김유신"}; // 동적 바인딩 시험//////////////////////
		Person personLee = (Person) cons.newInstance(initargs);
		System.out.println(personLee);
//		Person.setName("Lee"); System.out.println(person); 
	}

}
