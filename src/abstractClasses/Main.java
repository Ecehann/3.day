package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGamer womanGamer = new WomanGamer();
		womanGamer.hesapla();
		womanGamer.gameOver();
	
		BaseGameCalculator baseGameCalculator = new ManGamer(); //DOĞRU
		
		/* BaseGameCalculator baseGameCalculator = new BaseGameCalculator() { //YANLIŞ kullanım (bööyle olsa bile zorunlu olarak hesapla yazışmalı)
			
			@Override
			public void hesapla() {  
				
			} */
		}

}
