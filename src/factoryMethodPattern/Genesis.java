package factoryMethodPattern;

public class Genesis implements Car {
	
	private static String productName = "Genesis";
	
	@Override
	public String toString() {
		return productName;
	}
}
