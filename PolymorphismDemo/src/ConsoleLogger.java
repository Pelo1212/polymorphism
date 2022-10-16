
public class ConsoleLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("logged to console:"+ message);// Base clasımınzdaki metodu burda kullanarak override ediyoruz 
		                                                   // yani annedeki methodu çocukta da kullanıp çıktısını değiştirdim.
	}

}
