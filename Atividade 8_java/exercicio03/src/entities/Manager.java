package entities;

public class Manager extends Employee {

	public Manager(String name, double salary) {
		super(name, salary);
	}
	
	@Override
	public double bonusCalculate() {
		return this.salary * 0.20;
	}

}
