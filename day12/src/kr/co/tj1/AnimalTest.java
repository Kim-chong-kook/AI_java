package kr.co.tj1;

import java.util.ArrayList;

class Animal{

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
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = (Animal) new Human(); // Animal로 up casting이 일어난다. // 이유형은 Animal이지만, Human의 Override만 실행한다.
		Animal tAnimal = (Animal) new Tiger();
		Animal eAnimal = (Animal) new Eagle();
		
		AnimalTest test = new AnimalTest(); // ★ 클레스마다 인스턴스를 생성할 수 있다.
		test.moveAnimal(hAnimal); //for를 통하지 않고 동물 각각의 class를 호출
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal); // 배열에 각각의 동물을 넣고 for로 동물 각각의 class를 호출
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move(); // 동물 각각의 class를 호출
		}
	}	
	
	public void moveAnimal(Animal animal) {
		animal.move(); // 동물 각각의 class를 호출
		
	}
}
