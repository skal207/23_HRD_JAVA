
public class MethodTest {
	
	// final이 있기 때문에 값을 바꿀 수 없음
	static final double PI = 3.141592;
	
	void gugu1() {
		
		int dan = 7;
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println("7 * " + i + " = " + dan * i);
		}
		
	}
	
	void gugu2(int dan) {
		
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
	}

	void gugu1(int dan, int limit) {
		
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
	}
	
	void gugu3(int limit) {
		
		for(int dan = 1 ; dan <= limit ; dan++) {
			for(int i = 1 ; i < 10 ; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
		
	}
	
	void ptintName (String name) {
		System.out.println(name);
	}
	
	String getName() {
		return "조중권";
	}
	
	static int square(int num) {
		return num * num;
	}
	
	static double area(double radius) {
		
		return radius * radius * PI;
		
	}
	
	public static void main(String[] args) {
		
		MethodTest met = new MethodTest();
		met.gugu1();
		met.gugu2(3);
		met.gugu3(5);
		int num1 = square(10);
		System.out.println(num1);
		met.ptintName("조중권");
		String n = met.getName();
		System.out.println("나의 이름은: " + n);
		
		System.out.println(MethodTest.area(6.0));
		
	}

}
