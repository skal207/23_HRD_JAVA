
public class AiCarTest {

	public static void main(String[] args) {
		
		Person hong = new Person();
		Car sportsCar = new Car();
		Car sedanCar = new Car(1000, "검은색");
		
		hong.age = 20;
		hong.name = "홍길동";
		
//		sportsCar.run(50);
//		sedanCar.run(5000);
		
		System.out.println(sedanCar.speed);
		System.out.println(sportsCar.speed);		
		System.out.println(sedanCar.color);		
		System.out.println(sportsCar.color);		
		
		hong.eat();
		hong.smile();

	}

}
