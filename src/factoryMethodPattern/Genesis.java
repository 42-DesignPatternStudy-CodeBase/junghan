package factoryMethodPattern;

public class Genesis implements Car {
	
	String productName = "noname";
	
	public Genesis(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return productName;
	}
}
