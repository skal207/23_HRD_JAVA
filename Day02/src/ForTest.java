public class ForTest {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println((i + 1) + " Hello JAVA");			
		}
		
		// 1부터 10까지의 합을 출력하시오. 이 때, 출력은 결과만 출력하기
		// 출력 결과: 1부터 10까지의 합 : 55
		for(int i = 1 ; i <= 10 ; i++) {
			sum = sum + i;
			
		}
		System.out.println("1부터 100까지의 합: " + sum);
		
		// 2. 구구단의 2단 출력하기
		// 출력 결과: 2 X 1 = 2
		//            2 X 2 = 4
		//             ...
		//            2 X 9 = 18
		for(int dan = 2 ; dan < 10 ; dan++) {
		
			for(int i = 1 ; i < 10 ; i++) {
				System.out.println(dan + " X " + i + " = " + (dan * i));
				
			}
			
			System.out.println("=================================");
			
		}
		
	}

}
