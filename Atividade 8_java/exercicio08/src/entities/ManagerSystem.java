package entities;

import java.util.ArrayList;
import java.util.List;

public class ManagerSystem {

	private List<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void calculatePayroll() {
		double totalSalaries = 0;
		double totalBonus = 0;
		
		for (Employee employee : employees) {
			totalSalaries += employee.calculateSalary();
			totalBonus += employee.calculateBonus();
		}
		
		System.out.println("Total de salários: R$" + totalSalaries);
		System.out.println("Total de Bônus: R$" + totalBonus);
	}
	
	public void promoteEmployee(Employee employee, String newPosition) {
		Employee newEmployee = null;
		
		if (newPosition.equalsIgnoreCase("Gerente")) {
			newEmployee = new Manager(employee.getName(), employee.getBaseSalary());
		} else if (newPosition.equalsIgnoreCase("Desenvolvedor")) {
			newEmployee = new Developer(employee.getName(), employee.getBaseSalary());
		} else if (newPosition.equalsIgnoreCase("Estagiário")) {
			newEmployee = new Trainee(employee.getName(), employee.getBaseSalary());
		}
		
		if (newEmployee != null) {
			employees.remove(employee);
			employees.add(newEmployee);
			System.out.println(employee.getName() + " foi promovido(a) para " + newPosition + ".");
		} else {
			System.out.println("Cargo inválido para promoção!");
		}
	}
}
