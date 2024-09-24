package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantityInStock;
	
	public Product(String name, double price, int quantityInStock) {
		this.name = name;
		setPrice(price);
		setQuantityInStock(quantityInStock);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("O preço não pode ser negativo.");
		}
	}
	
	public int getQuantityInStock() {
		return quantityInStock;
	}
	
	public void setQuantityInStock(int quantityInStock) {
		if (quantityInStock >= 0) {
			this.quantityInStock = quantityInStock;
		} else {
			System.out.println("A quantidade em estoque não pode ser negativa.");
		}
	}
	
	public void showProduct() {
		System.out.println("Nome do produto: " + name);
        System.out.println("Preço: R$" + price);
        System.out.println("Quantidade em estoque: " + quantityInStock);
	}
}
