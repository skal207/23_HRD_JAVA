import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		
		boolean run  = true;
		
		while(run) {
			
			System.out.println("----------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			int sel = scan.nextInt();
			
			switch(sel) {
			case 1:
				System.out.print("예금액> ");
				balance += scan.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= scan.nextInt();
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			
			
		}

	}

}
