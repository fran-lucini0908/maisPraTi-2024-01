package entities;

public class CreditCard extends PaymentMethod {

	private String cardNumber;
	private String cardholderName;
	private String validity;
	private String securityCode;
	
	public CreditCard(String cardNumber, String cardholderName, String validity, String securityCode) {
		this.cardNumber = cardNumber;
		this.cardholderName = cardholderName;
		this.validity = validity;
		this.securityCode = securityCode;
	}

	@Override
	public void processPayment(double value) {
		if (validPayment()) {
			System.out.println("Processando pagamento de R$ " + value + " com Cartão de Crédito.");
		} else {
			System.out.println("Falha na validação do pagamento com Cartão de Crédito.");
		}
	}

	@Override
	public boolean validPayment() {
		return !cardNumber.isEmpty() && !securityCode.isEmpty();
	}
	
	
}
