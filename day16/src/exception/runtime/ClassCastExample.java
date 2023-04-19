package exception.runtime;

// 상속관계 : 부모 Animal을 상속한 자식 Dog, Cat
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCastExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal da = d;
		d = (Dog) da;
		System.out.println(new StringBuffer("타입 변환 성공 : Animal -> dog"));
		
		Animal c = new Cat();
		Dog d2 = (Dog)c;
		System.out.println(new StringBuffer("타입 변환 성공? : Dog -> Cat"));

	}

}
