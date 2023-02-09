package factoryMethodPattern;

public class Sonata implements Car {
	
	private static String productName = "Sonata";
	
	@Override
	public String toString() {
		return productName;
	}
}
