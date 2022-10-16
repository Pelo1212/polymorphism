
public class CustomerManager {
	
	private BaseLogger logger;  // BaseLogger tipinde logger isminde bir değişken tanımladım.private olunca aklına new gelsin
	
	public CustomerManager(BaseLogger logger) { // constructor bloğumun içine paremetre olarak private değişkenimi atadım
	 this.logger=logger;                                        // aslında burda newliyorum gibi düşünebilirsin.
	                                            // CustomerManageri main de newlediğimde bana bir BaseLogger vericek yani ben anneyle iş yapıyorumki hepsini kapsasın
		                                        // main de new lwdiğimde istediğim baselogger ı da parametre olarak yazabililrm çocuklarını falan...
	}
	
	public void add() {
		System.out.println("müşteri eklendi");
		this.logger.log("log mesajı");// benim classımdaki logger değişkenine ait log metodunu kullanıyorum demek.
		                              // mainde fileLogger yazdığım için yukardaki BaseLogger aslında FileLogger sadece onun referansını tutuyor
		                               // burda da FileLogger ın log unu çağırmış oluyorum aslında.başka çocuk yazsaydım onun içinde aynı şey geçerli
		
	}

}
