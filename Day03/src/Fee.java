import java.util.Scanner;

public class Fee {

	public static void main(String[] args) {
		
		System.out.println("---메뉴----");
		System.out.println("1. 가정용 | 2. 상업용 | 3. 공업용");
		System.out.println("-----------");
		System.out.print("메뉴>>");
		
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		int fare = 0;
		double tax = 0.5;
		System.out.print("사용량을 입력하세요>> ");
		int use = sc.nextInt();
		
		switch (code) {
			
			case 1:
				fare = use * 50;
				
				break;
			
			case 2:
				fare = use * 45;
				
				break;
				
			case 3:
				fare = use * 30;
				
				break;
		
		}
		System.out.println("사용요금: " + fare);
		tax = fare * 0.5;
		double total = fare + tax;
		System.out.println("총수도요금: " + total);


	}

}
