package hw2;

public class TestHarness {
	public static void main(String[] args) {
		Clock c1 = new Clock("10:23", "6:00");
		c1.setAlarmTime("7:30");
		c1.setAlarmTime("8:00");
		c1.setAlarmTime("10:00");
		c1.setAlarmTime("11:00");
		
		c1.removeAlarmTime();
		c1.showAlarmTimes();
		
		System.out.println();
		c1.print();
	}
}