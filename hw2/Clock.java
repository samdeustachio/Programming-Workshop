package hw2;

import java.util.Scanner;

public class Clock {
	private ClockAlarm clockAlarm = new ClockAlarm();
	private String currentTime = "";
	private Scanner zildjian = new Scanner(System.in);
	
	public Clock(String cTime) {
		this.currentTime = cTime;
	}
	
	public Clock(String cTime, String sAlarm) {
		this.currentTime = cTime;
		this.setAlarmTime(sAlarm);
	}
	
	public void setAlarmTime(String t) {
		this.clockAlarm.addAlarmTime(t);
	}
	
	public void removeAlarmTime() {
		this.clockAlarm.displayAlarmTime();
		System.out.println("Which alarm would you like to remove? (enter the alarm's number)");
		int num = zildjian.nextInt();
		this.clockAlarm.deleteAlarmTime(num);
	}
	
	public void showAlarmTimes() {
		this.clockAlarm.displayAlarmTime();
	}
	
	public void print() {
		this.showAlarmTimes();
		System.out.println("The current time is " + this.currentTime);
	}
}
