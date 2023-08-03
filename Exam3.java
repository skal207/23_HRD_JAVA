public class Exam3 {

	public static void main(String[] args) {
		
		int charCode = 'A'; // 문자 값은 65
		int charCode2 = 10;
		double charCode3 = 160;
		
		if (( 65 <= charCode) && (charCode <= 90)) // 65 이상 이고 90이하 라면
			System.out.println("대문자이군요");
		
		if (( 15 <= charCode2) || (charCode3 <= 160)) // 15세이상 160이하 라면
			System.out.println("놀이기구 탑승가능 이군요");
		
		// if문
		// 직관적으로 잘보임
		if (charCode2 % 2 == 0)
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
		
		// 3항 연산자
		// 알아보기 까다로움
		boolean k;
		k = (charCode2 % 2) == 0;
		System.out.println(k ? "짝수" : "홀수");
		
		//----------------------------------------------------
		
		// 증감연산자 계산
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		
		//----------------------------------------------------------
		
		int pencils = 534;
		int students = 30;
		
		int pencelsPerStudent = pencils / students;
		System.out.println(pencelsPerStudent);
		
		int pencelsLeft = pencils % students;
		System.out.println(pencelsLeft);
		
		//--------------------------------------------------------
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = (lengthTop + lengthBottom) * height / 2.0;
		
		System.out.println(area);
		
		//------------------------------------------------------------
		
		int g = 10;
		int t = 5;
		
		System.out.println( (g > 7) && (t <= 5));
		System.out.println( (g % 3 == 2) || (t % 2 != 1));
		
		//-----------------------------------------------------------------
		
		double xx = 5.0;
		double yy = 0.0;
		double zz = 5 % yy;
		
		if (Double.isNaN(zz))
			System.out.println("0.0으로 나눌 수 없습니다.");
		else {
			double result = zz + 10;
			System.out.println(result);
		}	
		

		
		
	
		
	}

}
