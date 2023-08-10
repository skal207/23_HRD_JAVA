
public interface RemoteControl {
	// 구성요소..
	// 상수필드, 추상메소드
	
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	// 추상 메소드(인터페이스는 abstract생략 가능)
	void turnOn();
	void turnoff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	// static (정적) 메소드
	// 구현객체 없이 호출 가능
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}

}
