package kr.co.tj1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest_forName {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		// public static void main(String[] args) throws ClassNotFoundException{
		Class c = Class.forName("java.lang.String"); 
		System.out.println(c);
		Constructor[] cons = c.getConstructors();
		for(Constructor co : cons){
		    System.out.print(co);
		}
		
		Method[] m =  c.getMethods( );
		for(Method mth : m){
			   System.out.println(mth);
			}

	}

}
