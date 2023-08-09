package my.day05.exam2;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델: " + sp.model);
		System.out.println("색상: " + sp.color);
		
		System.out.println("와이파이 상태: " + sp.wifi);
		
		sp.bell();
		sp.sendVoice("여보세요.");
		sp.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		sp.sendVoice("아~ 네, 반갑습니다.");
		sp.hangUp();
		
		sp.setWifi(true);
		sp.internet();

	}

}
