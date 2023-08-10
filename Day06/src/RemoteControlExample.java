
public class RemoteControlExample {

	public static void main(String[] args) {
		
		///////////////////////////////////
		RemoteControl re = null;
		re = new Television();
		///////////////////////////////////
		
		re.turnOn();
		re.setVolume(5);
		re.turnoff();

		re.turnOn();
		re.setVolume(15);
		
		re.setMute(true);
		re.setMute(false);
		
		///////////////////////////////////
		RemoteControl au;
		au = new Audio();
		///////////////////////////////////
		
		au.turnOn();
		au.setVolume(5);
		au.turnoff();
		
		au.turnOn();
		au.setVolume(15);
		
		RemoteControl.changeBattery();
	}

}
