package n1exercici1;

public class App {

	public static void main(String[] args) {
		
		//Demonstration of try-catch new exception
		System.out.println("Creamos primera venta.");
		Sale firstSale = new Sale();
		
		System.out.println("Añadimos productos a la primera venta...");
		firstSale.addProduct(new Product("Sandía", 3));
		firstSale.addProduct(new Product("Melón", 2));
		firstSale.addProduct(new Product("Naranjas", 5));
		
		//Price calculated properly, there's products in the arraylist
		try {
			firstSale.calculateTotal();
			System.out.println("El total de los productos asciende a "+firstSale.getTotalPrice()+"€.");
		}catch(EmptySaleException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Creamos segunda venta.");
		Sale secondSale = new Sale();
		
		//We catch the exception, as there's no products yet in the array
		try {
			secondSale.calculateTotal();
			System.out.println("El total de los productos asciende a "+secondSale.getTotalPrice()+"€.");
		}catch(EmptySaleException e) {
			System.out.println(e.getMessage());
		}
		
		//Demonstration of try-catch IndexOutOfBoundsException
		
		try {
			System.out.println("We try to get into the name of index 0 of the firstSale products ArrayList.");
			System.out.println(firstSale.getProducts().get(0).getName());
			System.out.println("Now we try to get into the name of index 5 of the firstSale products ArrayList.");
			System.out.println(firstSale.getProducts().get(5).getName());
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		

		
		
		

	}

}
