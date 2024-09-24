package entities;

public class Bicycle implements IMeansTransport{

	@Override
	public void accelerate() {
		System.out.println("A bicicleta está acelerando.");
	}

	@Override
	public void brake() {
		System.out.println("A bicicleta está freando.");
	}	
}
