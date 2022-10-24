package staticDemo;
 
 //ürünleri doğrulamak. (bir ürünü kaydederken ürün kurallara uygun mu?)

public class ProductValidator {
	
	static {
		System.out.println("Statik yapıcı blok çalıştı");
	}
	
	public ProductValidator() { //ProductManager classında ProductValidator'u new'lediğimiz için yapıcı blok çalıştı
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) { //ürünün veritabanına kaydedilebilmesi için fiyatının 0dan büyük olması ve isminin de verilmiş olması lazım) 
			return true;
		}else {
			return false;
		}
	}
	
	public void bişey () {	}
	
	public static class BaskaBirClass {  //inner class
		public static void Sil() {
			
		}
	}
}
