package SimpleFactoryDesignPattern;

import FactoryProducts.Blue;
import FactoryProducts.ColorFactory;
import FactoryProducts.Green;
import FactoryProducts.Red;

public class SimpleFactoryFactoryClass {
	private static ColorFactory obj; 
	public static ColorFactory getColorObject(String a){
		if(a=="Blue"){
			obj= new Blue(); 
		}
		else if(a=="RED"){
			obj= new Red(); 
			
		}else{
			obj= new Green(); 
			
		}
		return obj; 
		
	}

}
