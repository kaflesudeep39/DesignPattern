package FactoryProducts;

public class Red implements ColorFactory{
@Override
public String getcolorName() {
	// TODO Auto-generated method stub
	return "RED";
}
@Override
	public void printColor() {
	 System.out.println("RED");
		
	}
}
