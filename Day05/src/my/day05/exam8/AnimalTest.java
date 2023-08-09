package my.day05.exam8;

public class AnimalTest {
	
	// 매개변수의 다형성
	static void animalsound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		
		Animal an = new Dog();
		an.name = "강아지";
		an.sound();
		
		Cat cat = new Cat();
		cat.name = "야옹이";
		cat.sound();
		
		/////////////////////////////////////////////////////////////
		AnimalTest.animalsound(an); // 이 방법도 가능(this또한 가능)
		animalsound(cat);           // 그냥써도 가능
		/////////////////////////////////////////////////////////////
				

	}

}
