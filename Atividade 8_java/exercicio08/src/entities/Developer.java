package entities;

public class Developer extends Employee {

	public Developer(String name, double baseSalary) {
		super(name, baseSalary);
	}

	@Override
	public double calculateSalary() {
		return getBaseSalary() * 1.2;
	}

	@Override
	public double calculateBonus() {
		return getBaseSalary() * 0.2;
	}

}
