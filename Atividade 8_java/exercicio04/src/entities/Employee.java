package entities;

public class Employee {
	protected String name;
	protected double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public double bonusCalculate() {
		return 0;
	}
	
	public void work() {
		System.out.println("O funcionário está trabalhando.");
	}
}
