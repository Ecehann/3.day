package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		this.pushFileSystem(data);
		System.out.println("Dosyaya loglandı : " + data);
		
	}
	
	private void pushFileSystem(Object obj) {
		// Dosyaya yaz
		return;
	}

}
