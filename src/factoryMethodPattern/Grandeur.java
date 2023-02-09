package factoryMethodPattern;

public class Grandeur implements Car {
	
	private static String productName = "Grandeur";
	
	@Override
	public String toString() {
		return productName;
	}

}
