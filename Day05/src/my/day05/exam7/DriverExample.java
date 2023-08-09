package my.day05.exam7;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver dv = new Driver();
		
		Bus b = new Bus();
		dv.drive(b);
		
		Texi t = new Texi();
		dv.drive(t);

	}

}
