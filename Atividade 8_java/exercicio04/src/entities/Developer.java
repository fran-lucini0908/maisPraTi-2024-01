package entities;

public class Developer extends Employee{

	public Developer(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double bonusCalculate() {
		return this.salary * 0.10;
	}
	
	@Override
	public void work() {
		System.out.println("O desenvolvedor está codando e solucionando bugs.");
	}
}
