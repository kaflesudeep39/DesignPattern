package FactoryProducts;

public class Blue implements ColorFactory {

	@Override
	public String getcolorName() {
		// TODO Auto-generated method stub
		return "Blue";
	}
	@Override
	public void printColor() {
		System.out.println("Blue");
	}
}
