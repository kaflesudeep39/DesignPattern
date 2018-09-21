package SingletonDesignPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerilizableSingletonPattern implements Serializable {
	
	private SerilizableSingletonPattern(){
		
	}
	
	private static class HelperInner{
		private static final SerilizableSingletonPattern INSTANCE = new SerilizableSingletonPattern(); 
		
		private static SerilizableSingletonPattern getInstance(){
			return HelperInner.INSTANCE; 
		}
		
//		In order to make serialization and singleton work properly,we have to introduce readResolve() method in the singleton
		//class.readResolve() method lets developer control what object should be returned  on deserialization.
		
		 private Object readResolve() throws ObjectStreamException{
			  return INSTANCE;
			 }

		
	}
	

	
}
