package application;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product("Tênis", 135.99, 15);
		
		product1.showProduct();
		
		try {
			product1.applyDiscount(20);
			System.out.println("Desconto de 20% aplicado com sucesso!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		product1.showProduct();
		
		try {
			product1.applyDiscount(60);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		product1.showProduct();
	}

}
