package lab1;

public class TestHarness {
	public static void main(String[] args) {
		Heater h = new Heater();
		
		System.out.println("The temperature is " + h.getTemp() + " degrees");
		h.warmer();
		
		System.out.println("The temperature is " + h.getTemp() + " degrees");
		h.colder();
		h.colder();
		
		System.out.println("The temperature is " + h.getTemp() + " degrees");
		h.setIncrement(15);
		h.warmer();
		
		System.out.println("The temperature is " + h.getTemp() + " degrees");
		h.warmer();
		
		System.out.println("The temperature is " + h.getTemp() + " degrees");
		h.colder();
		h.colder();
		
		System.out.println("The temperature is " + h.getTemp() + " degrees");
		h.colder();
	}
}