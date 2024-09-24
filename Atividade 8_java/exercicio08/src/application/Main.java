package application;

import entities.Developer;
import entities.Employee;
import entities.Manager;
import entities.ManagerSystem;
import entities.Trainee;

public class Main {

	public static void main(String[] args) {
		ManagerSystem system = new ManagerSystem();
		
		Employee manager = new Manager("Matheus", 10000.00);
		Employee dev = new Developer("Fernanda", 8000.00);
		Employee estag = new Trainee("Gabriel", 2000.00);
		
		system.addEmployee(manager);
		system.addEmployee(dev);
		system.addEmployee(estag);
		
		system.calculatePayroll();
		
		system.promoteEmployee(estag, "Desenvolvedor");
		
		system.calculatePayroll();
	}

}
