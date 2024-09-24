package entities;

public class Trainee extends Employee {

	public Trainee(String name, double baseSalary) {
		super(name, baseSalary);
	}

	@Override
	public double calculateSalary() {
		return getBaseSalary();
	}

	@Override
	public double calculateBonus() {
		return getBaseSalary() * 0.1;
	}

}
