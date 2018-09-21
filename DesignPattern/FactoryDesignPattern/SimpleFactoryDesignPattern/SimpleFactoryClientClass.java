package SimpleFactoryDesignPattern;

import FactoryProducts.ColorFactory;

public class SimpleFactoryClientClass {

	public static void main (String [] args){
		ColorFactory sfc = SimpleFactoryFactoryClass.getColorObject("Blue"); 
		sfc.printColor();
		ColorFactory sfc1 = SimpleFactoryFactoryClass.getColorObject("Red"); 
		sfc1.printColor();
		
	}
}
