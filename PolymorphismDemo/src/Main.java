
public class Main {

	public static void main(String[] args) {
		
  /*  BaseLogger []loggers=new BaseLogger[] {new FileLogger(), new EmailLogger(), new DataBaseLogger(),new ConsoleLogger() }
       for(BaseLogger logger:loggers) {          // bu for la 4 elemanı tek tek dolaşıyorum.
    	   logger.log("log mesaji);
    	   
       }*/
		
		CustomerManager customerManager =new CustomerManager(new FileLogger());// newlediğim clasımın içinde başka bir classı newliyorum kullanmak için 
			customerManager.add();
		
	}

}
