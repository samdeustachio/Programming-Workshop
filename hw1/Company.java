package hw1;

public class Company {
	private Employee[] staff = new Employee[3];
	
	public void addEmployee(Employee e, int num) {
		staff[num - 1] = e;
	}
	
	public void getEmployeeCount() {
		int num = staff.length;
		System.out.println("There are " + num + " employees at this company");
	}
}