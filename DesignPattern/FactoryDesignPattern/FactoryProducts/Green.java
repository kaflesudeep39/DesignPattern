package FactoryProducts;

public class Green implements ColorFactory{
@Override
public String getcolorName() {
	// TODO Auto-generated method stub
	return "Green";
}
@Override
	public void printColor() {
		System.out.println("Green");
		
	}
}
