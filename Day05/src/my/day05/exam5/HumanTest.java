package my.day05.exam5;

public class HumanTest {

	public static void main(String[] args) {
		
		Human sm = new SuperMan(); // 자동 형변환(업 캐스팅)
		sm.name = "슈퍼맨";
		sm.height = 170;
		((SuperMan)sm).power = 50; // 강제 형변환(다운 캐스팅)
		String result = sm.getInfo();
		System.out.println("---슈퍼맨의 정보---");
		System.out.println(result);
		
		Human aq = new Aquaman(); // 자동 형변환(업 캐스팅)
		aq.name = "아쿠아맨";
		aq.height = 180;
		((Aquaman)aq).speed = 120; // 강제 형변환(다운 캐스팅)
		String result2 = aq.getInfo();
		System.out.println("---아쿠아맨의 정보---");
		System.out.println(result2);


	}

}
