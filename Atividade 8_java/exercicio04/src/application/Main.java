package application;

import entities.Employee;
import entities.Manager;
import entities.Developer;

public class Main {

	public static void main(String[] args) {
		Employee manager = new Manager("Juliana", 8000.00);
		Employee dev = new Developer("Alessandra", 5500.00);
		Employee employee = new Employee("Karoline", 4000.00);
		
		System.out.println("Bônus do gerente " + manager.getName() + ": " + manager.bonusCalculate());
		System.out.println("Bônus do desenvolvedor " + dev.getName() + ": " + dev.bonusCalculate());
		System.out.println("Bônus do funcionário " + employee.getName() + ": " + employee.bonusCalculate());
		
		manager.work();
		dev.work();
		employee.work();
	}

}
