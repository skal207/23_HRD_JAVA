package my.day05.exam4;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicPlane sp = new SupersonicPlane();
		sp.takeOff();
		sp.fly();
		sp.flymode = SupersonicPlane.SUPERSONIC;
		sp.fly();
		sp.flymode = SupersonicPlane.NOMAL;
		sp.fly();
		sp.land();

	}

}
