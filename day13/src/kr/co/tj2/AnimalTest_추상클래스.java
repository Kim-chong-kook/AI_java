package kr.co.tj2;

import java.util.ArrayList;

abstract class Animal{
	
	// 이부분은 사용되지 않는다. 그래서 추상 클래스가 대두된다.
	public void move(){
	     System.out.println("동물이 움직입니다."); 
	}
}

class Human extends Animal{

	@Override
	public void move(){
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBook(){
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move(){
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting(){
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	@Override
	public void move(){
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	
	public void flying(){
		System.out.println("독수리가 양날개를 쭉 펴고 멀리 날아갑니다");
	}
}

public class AnimalTest_추상클래스 {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		/*AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		AnimalTest_추상클래스 test = new AnimalTest_추상클래스();
		test.testDownCasting(animalList);
		
		
		
	/*	for(Animal animal : animalList) {
			animal.move();
		}
		*/	
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i =0; i<list.size(); i++) {
			Animal animal = list.get(i);
		
			if ( animal instanceof Human) { // instanceof 속에서
				Human human = (Human)animal; // ★★★ 강제 형변환 필요하다.
				human.readBook(); 
				// ★★★★★★ 업캐스팅하면서 자식 자체 메소드 사용불가 했었고, 다시 다운캐스팅하면서 사용가능해 졌다.
			}
			else if( animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if( animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
}

