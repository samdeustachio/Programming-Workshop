package lab1;

public class Heater {
	private double temp;
	private double minTemp;
	private double maxTemp;
	private double increment;
	
	public Heater() {
		this.temp = 70;
		this.minTemp = 50;
		this.maxTemp = 90;
		this.increment = 5;
	}
	
	public void warmer() {
		if(this.temp <= (this.maxTemp - this.increment)) {
			this.temp += this.increment;
		} else {
			System.out.println("The heater does not go above " + this.maxTemp + " degrees.");
		}
	}
	
	public void colder() {
		if(this.temp >= (this.minTemp + this.increment)) {
			this.temp -= this.increment;
		} else {
			System.out.println("The heater does not go below " + this.minTemp + " degrees.");
		}
	}
	
	public double getTemp() {
		return this.temp;
	}
	
	public void setIncrement(double d) {
		this.increment = d;
		System.out.println("The new increment is " + d + " degrees.");
	}
}