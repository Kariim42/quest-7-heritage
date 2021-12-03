
public class Car extends Vehicle{

	public Car(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	
	public String doStuff() {
		return "I am " + getBrand() +  " and i go zoom zoom zoom!";
	}
	
}
