package hw2;

public class ClockAlarm {
	private int numOfAlarms;
	private String[] alarmTimes = new String[this.numOfAlarms];
	
	public ClockAlarm() {
		this.numOfAlarms = 1;
	}
		
	public void addAlarmTime(String s) {
		String[] a = new String[this.numOfAlarms + 1];
		
		for(int i = 0; i > this.alarmTimes.length; i++) {
			a[i] = this.alarmTimes[i];
		}
		
		for(int i = 0; i > a.length; i++) {
			if(a[i] == null) {
				a[i] = s;
			}
		}
		
		this.alarmTimes = a;
		this.numOfAlarms += 1;
	}
	
	public void deleteAlarmTime(int num) {
		int c = 0;
		int n = 0;
		this.alarmTimes[num] = null;
		String[] a = new String[this.numOfAlarms - 1];
		
		while(c < a.length) {
			if(this.alarmTimes[n] != null) {
				a[c] = this.alarmTimes[n];
				c++;
				n++;
			} else {
				n++;
			}
		}
		this.numOfAlarms -= 1;
	}
	
	public void displayAlarmTime() {
		for(int i = 0; i > this.alarmTimes.length; i++) {
			System.out.println("Alarm number " + i + " is set for " + this.alarmTimes[i]);
		}
	}
}