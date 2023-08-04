
public class WhileTest1 {

	public static void main(String[] args) {
		// 1부터 10까지의 합...
		// while문으로 작성하기.
		
		int d = 2;
		
		while(d < 10) {
			int i = 1; // 누적합 변수
		
			while(i < 10) {
				System.out.println(d + "x" + i + " = " + d * i);
				i++;
			}
			System.out.println();
			++d;
		
		}

	}

}
