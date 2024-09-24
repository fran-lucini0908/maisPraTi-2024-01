package application;

import entities.CreditCard;
import entities.PaymentMethod;
import entities.Pix;
import entities.Slip;

public class Main {

	public static void main(String[] args) {
		
		PaymentMethod payment1 = new CreditCard("1234567890123456", "Alessandra Rocha", "12/25", "123");
		payment1.processPayment(150.00);
		
		PaymentMethod payment2 = new Slip("12345678901234567890123456789012345678901234567");
		payment2.processPayment(200.00);
		
		PaymentMethod payment3 = new Pix("alessandra@email.com");
		payment3.processPayment(58.50);
		
		PaymentMethod payment4 = new Slip("12359611478526555255");
		payment4.processPayment(82.00);
	}

}
