package entities;

public class Manager extends Employee {

	public Manager(String name, double salary) {
		super(name, salary);
	}
	
	@Override
	public double bonusCalculate() {
		return this.salary * 0.20;
	}

	@Override
	public void work() {
		System.out.println("O gerente está gerenciando a equipe e definindo estratégias.");
	}
}
