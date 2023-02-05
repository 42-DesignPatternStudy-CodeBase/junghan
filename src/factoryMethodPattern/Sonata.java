package factoryMethodPattern;

public class Sonata implements Car {
	
	String productName = "noname";
	
	public Sonata(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return productName;
	}
}
