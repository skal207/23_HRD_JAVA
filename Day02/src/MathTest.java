
public class MathTest {

	public static void main(String[] args) {
		
		int mx = Math.max(-5, -8);
		System.out.println("-8과 -5의 최대값: " + mx);
		
		int min = Math.min(-5, -8);
		System.out.println("-8과 -5의 최소값: " + min);
		
		double mx2 = Math.max(1.23, 3.45);
		System.out.println("1.23과 3.45의 최대값: " + mx2);
		System.out.println("3.45의 천정값: " + Math.ceil(5.67));
		System.out.println("3.45의 마루값: " + Math.floor(5.67));
		
		double pw = Math.pow(3, 7);
		System.out.println("3의 7승: " + pw);
		double sq = Math.sqrt(64.0);
		System.out.println("64.0의 제곱근: " + sq);
		
		int radius = 5;
		double area = radius * radius * Math.PI;
		System.out.println("반지름이: " + radius + "면적은: " + area);
		
		double area2 = 2 * radius * Math.PI;
		System.out.println("반지름이: " + radius + "둘레는: " + area2);
		

	}

}
