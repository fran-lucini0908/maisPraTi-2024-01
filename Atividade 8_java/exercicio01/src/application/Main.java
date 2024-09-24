package application;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product("Tênis", 135.99, 15);
		
		product1.showProduct();
		
		product1.setPrice(175.69);
		product1.setQuantityInStock(20);
		
		product1.showProduct();
		
		product1.setPrice(-135.99);
		product1.setQuantityInStock(-10);
		
		product1.showProduct();
	}

}
