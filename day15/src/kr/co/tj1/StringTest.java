package kr.co.tj1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String"); // 오라클, MySql 등의 DB에서 사용법과 같다.
		System.out.println(c); // 출력 : class java.lang.String
		
		//Constructor[] cons = c.getConstructors();
		Constructor<String>[] cons = c.getConstructors();
		for(Constructor co : cons){
		    System.out.print(co);
		}
		System.out.println();
		
		Method[] m =  c.getMethods( );
		for(Method mth : m){
			   System.out.println(mth); // 메서드 나열됨
		}
	}
}
