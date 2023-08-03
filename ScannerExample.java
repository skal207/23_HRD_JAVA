import java.util.Scanner; // Scanner는 만들어져 있는 것을 쓰는 것이기 때문에 import필요

public class ScannerExample {

	public static void main(String[] args) {
		
		String name;
		int age;
		String dept;
		double height;
		
		// 입력 객체 생성(새롭게 객체를 생성하는 역할)
		Scanner scan = new Scanner(System.in);
		
		// 데이터 읽어오기
		System.out.print("이름을 입력하세요>> ");
		name = scan.next();
		
		System.out.print("나이을 입력하세요>> ");
		age = scan.nextInt();
		
		System.out.print("키을 입력하세요>> ");
		height = scan.nextDouble();
		
		System.out.print("전공을 입력하세요>> ");
		dept = scan.next();
		
		System.out.printf("이름: %s, 나이: %d, 키: %5.1f, 전공: %s", name, age, height, dept);

	}

}
