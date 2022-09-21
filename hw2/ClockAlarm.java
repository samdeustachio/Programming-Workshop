package hw2;

public class ClockAlarm {
	private int numOfAlarms = 1;
	private String[] alarmTimes = new String[this.numOfAlarms];

	public ClockAlarm(String s) {
		this.alarmTimes[0] = s;
	}

	public void addAlarmTime(String s) {
		String[] a = new String[this.numOfAlarms + 1];

		for(int i = 0; i < this.alarmTimes.length; i++) {
			a[i] = this.alarmTimes[i];
		}

		int num = a.length - 1;
		a[num] = s;

		this.alarmTimes = a;
		this.numOfAlarms += 1;
	}

	public void deleteAlarmTime(int num) {
		int c = 0;
		int n = 0;
		
		this.alarmTimes[num - 1] = null;
		String[] a = new String[this.numOfAlarms - 1];

		while(c < this.alarmTimes.length) {
			if(this.alarmTimes[c] != null) {
				a[n] = this.alarmTimes[c];
				n++;
			}
			c++;
		}
		
		this.alarmTimes = a;
		this.numOfAlarms -= 1;
	}

	public void displayAlarmTime() {
		for(int i = 0; i < this.alarmTimes.length; i++) {
			System.out.println("Alarm number " + (i + 1) + " is set for " + this.alarmTimes[i]);
		}
	}
}