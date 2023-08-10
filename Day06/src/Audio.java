
public class Audio implements RemoteControl {
	
	private int volume1;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnoff() {
		System.out.println("Audio를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume1 = RemoteControl.MIN_VOLUME;
		}else if(volume > RemoteControl.MAX_VOLUME) {
			this.volume1 = RemoteControl.MAX_VOLUME;
		}else {
			this.volume1 = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume1);
	}

}
