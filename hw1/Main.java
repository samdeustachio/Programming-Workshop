package hw1;

public class Main {
	public static void main(String[] args) {
		Employee Joe = new Employee("Joe", "Receiving and processing");
		Employee Steve = new Employee("Steve", "Manager");
		Employee Bob = new Employee("Bob", "Cashier");
		
		Company pear = new Company();
		
		pear.addEmployee(Joe, 1);
		pear.addEmployee(Steve, 2);
		pear.addEmployee(Bob, 3);
		
		pear.getEmployeeCount();
	}
}