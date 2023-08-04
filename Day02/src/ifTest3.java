import java.util.Scanner;

public class ifTest3 {

	public static void main(String[] args) {
		
		// 문제1: 0부터 9사이의 정수를 입력받아...
		// 짝수, 홀수를 판단하는 코드를 작성하시오...
		// 단 if문으로 작성하기
		Scanner scan = new Scanner(System.in);
		
		int result;
		
		while(true) {
		
		System.out.print("1부터9 사이의 값을 입력하세요>> ");
		result = scan.nextInt();
		
		if ( result % 2 == 0 ) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");			
		}
		
		}	

	}

}
