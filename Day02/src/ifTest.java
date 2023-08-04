import java.util.Scanner;

public class ifTest {

	public static void main(String[] args) {
		
		int score;
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
		System.out.print("점수를 입력하세요>> ");
		score = scan.nextInt();
		
		// 90점 이상이면 합격을 출력하기
		if (score >= 90 ) {
			System.out.println("A");
		} else if ( score >= 80 ) {
			System.out.println("B");
		} else if ( score >= 70 ) {
			System.out.println("C");			
		} else if ( score >= 60 ) {
			System.out.println("D");															
		} else {
			System.out.println("F");												
		}
		
		}
			

	}

}
