package entities;

public class Pix extends PaymentMethod {
	
	private String pixKey;

	public Pix(String pixKey) {
		this.pixKey = pixKey;
	}

	@Override
	public void processPayment(double value) {
		if (validPayment()) {
            System.out.println("Processando pagamento de R$ " + value + " com Pix.");
        } else {
            System.out.println("Falha na validação do pagamento com Pix.");
        }
	}

	@Override
	public boolean validPayment() {
		return !pixKey.isEmpty();
	}
	
	

}
