import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		int midScore;
		int finalScore;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("중간고사 성적을 입력하세요>> ");
		midScore = scan.nextInt();
		
		System.out.print("기말고사 성적을 입력하세요>> ");
		finalScore = scan.nextInt();
		
		
		System.out.println("학기 전 홍팍이의 중간점수: ");
		System.out.println(midScore);
		
		System.out.println("학기 전 홍팍이의 기말점수: ");
		System.out.println(finalScore);

	}

}
