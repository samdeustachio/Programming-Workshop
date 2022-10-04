package hw3;

import java.util.*;

public class BeachReport {
	private ArrayList <String> beachList = new ArrayList <String>();
	private Scanner zildjian = new Scanner(System.in);
	
	public void addBeach(String str) {
		this.beachList.add(str);
	}
	
	public void removeBeach() {
		System.out.println();
		this.showAllBeachesNum();
		System.out.println();
		System.out.println("Which beach would you like to remove?");
		int num = zildjian.nextInt();
		this.beachList.remove(num - 1);
	}
	
	public void findBeach(String str) {
		boolean b = false;
		for(String i : this.beachList) {
			if(i.equals(str)) {
				System.out.println(str + " is in the list");
				b = true;
			}
		}
		if(b = false) {
			System.out.println("That beach is not in the list");
		}
	}
	
	public void showAllBeaches() {
		for(String i : this.beachList) {
			System.out.println(i);
		}
	}
	
	public void showAllBeachesNum() {
		int num = 0;
		for(String i : this.beachList) {
			System.out.println((num + 1) + " - " + i);
			num++;
		}
	}
	
	public int getBeachCount() {
		int num = this.beachList.size();
		System.out.println("There are " + num + " beaches in this list");
		return num;
	}
}