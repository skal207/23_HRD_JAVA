package my.day05;

public class HumanRobot {

	public static void main(String[] args) {
		
		Human hu = new Human();
		hu.setAddr("대전 동구 용운동");
		hu.setAge(20);
		hu.setName("로봇1");
		
		System.out.println(hu.toString());

	}

}
