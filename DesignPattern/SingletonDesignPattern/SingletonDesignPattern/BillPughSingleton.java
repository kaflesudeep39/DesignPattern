package SingletonDesignPattern;

public class BillPughSingleton {
	// When the singleton class is loaded, inner class is not loaded and hence doesn’t create object when loading the class. 
	//Inner class is created only when getInstance() method is called. So it may seem like eager initialization but it is lazy initialization.
	//This is the most widely used approach as it doesn’t use synchronization.
	
	private BillPughSingleton(){
		
	}
	
	private static class HelperInner{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton(); 
		
		public static BillPughSingleton getInstane(){
			return HelperInner.INSTANCE; 
		}
	}
}
