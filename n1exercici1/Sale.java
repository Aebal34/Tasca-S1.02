package n1exercici1;

import java.util.ArrayList;

public class Sale {

	private int totalPrice;
	private ArrayList<Product> products;
	
	//CONSTRUCTOR
	
	public Sale() {
		totalPrice = 0;
		products = new ArrayList<Product>();
	}
	
	//GETTERS
	
	public int getTotalPrice() {
		return totalPrice;
	}
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	//METHODS
	
	public void calculateTotal() throws EmptySaleException {
		
		if(products.size()==0) {
			throw new EmptySaleException("Para realizar una venta, primero añada productos.");
		}else {
			for(int i=0; i<products.size(); i++) {
				
				totalPrice += products.get(i).getPrice();
			}
		}
	}
	public void addProduct(Product product) {
		products.add(product);
	}
}
