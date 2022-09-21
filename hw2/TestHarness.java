package hw2;

public class TestHarness {
	public static void main(String[] args) {
		Clock c1 = new Clock("10:23", "6:00");
		c1.setAlarmTime("7:30");
		c1.showAlarmTimes();
		
	}
}