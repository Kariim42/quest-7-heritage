
public class Hangar {

	public static void main(String[] args) {
		Boat yatch = new Boat("yatch", 10500);
		Car saxo = new Car("saxo", 10500);
		
		System.out.println(yatch.doStuff());
		System.out.println(saxo.doStuff());
	}

}
