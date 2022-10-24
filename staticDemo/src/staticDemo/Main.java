package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		
		Product product = new Product();
		product.name = "Mouse";
		product.id = 1;
		product.price = 100;
		
		manager.add(product);
		
	
	}

}
