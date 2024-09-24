package entities;

public class Train implements IMeansTransport{

	@Override
	public void accelerate() {
		System.out.println("O trem está acelerando.");
	}

	@Override
	public void brake() {
		System.out.println("O trem está freando.");
	}

}
