package SingletonDesignPattern;

public class EagerInitialization {
	// private and final class variable
	private static final EagerInitialization INSTANCE = new EagerInitialization(); 
	
	// private method
	private EagerInitialization(){
		
	}
	
	// public class method
	public static EagerInitialization getInstance(){
		return INSTANCE; 
	}

}
