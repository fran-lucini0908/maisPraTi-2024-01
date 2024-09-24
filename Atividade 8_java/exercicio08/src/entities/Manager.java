package entities;

public class Manager extends Employee {

	public Manager(String name, double baseSalary) {
		super(name, baseSalary);
	}

	@Override
	public double calculateSalary() {
		return getBaseSalary() * 1.5;
	}

	@Override
	public double calculateBonus() {
		return getBaseSalary() * 0.3;
	}
}
