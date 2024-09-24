package entities;

public class Slip extends PaymentMethod {
	
	private String barcode;

	public Slip(String barcode) {
		this.barcode = barcode;
	}

	@Override
	public void processPayment(double value) {
		if (validPayment()) {
            System.out.println("Processando pagamento de R$ " + value + " com Boleto.");
        } else {
            System.out.println("Falha na validação do pagamento com Boleto.");
        }
	}

	@Override
	public boolean validPayment() {
		return barcode.length() == 47;
	}

}
