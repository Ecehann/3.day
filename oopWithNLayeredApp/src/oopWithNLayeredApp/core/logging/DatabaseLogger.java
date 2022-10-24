package oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		this.pushDB(data);
		this.printout("Veritabanına loglandı : " + data);
	}
	
	private void printout(String message) {
		System.out.println(message);
	}
	
	private void pushDB(Object obj) {
		// Veritabanı işlemleri
		return;
	}
	
}
