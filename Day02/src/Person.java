
public class Person {
	
	String name = "";
	int age;
	
	public void eat(String sr) {
		
		System.out.println(sr + "을 먹는다.");
		
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}

	public static void main(String[] args) {
		
		Person per = new Person();
		per.age = 20;
		per.name = "홍길동";
		per.showInfo();
		
		Person per2 = new Person();
		per2.age = 21;
		per2.name = "박길동";
		per2.showInfo();
		
	}

}
