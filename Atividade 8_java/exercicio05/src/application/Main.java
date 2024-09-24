package application;

import entities.Bicycle;
import entities.Car;
import entities.IMeansTransport;
import entities.Train;

public class Main {

	public static void main(String[] args) {
		
		IMeansTransport[] transports = {new Car(), new Bicycle(), new Train()};
		
		for (IMeansTransport vehicle : transports) {
			vehicle.accelerate();
			vehicle.brake();
			System.out.println();
		}
	}

}
