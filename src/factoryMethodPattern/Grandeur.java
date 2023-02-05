package factoryMethodPattern;

public class Grandeur implements Car {
	
	String productName = "noname";
	
	public Grandeur(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return productName;
	}

}
