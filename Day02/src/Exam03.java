
public class Exam03 {

	public static void main(String[] args) {
		
		for(int i = 1 ; i <=10 ; i++) {
			if (i % 3 == 0) {
				System.out.print("짝");
				continue;
			}
			System.out.printf(" %d ",i);
		}
		
	}

}
