package decoratorPattern;

public class Decorator implements Coffee {
	private Coffee coffee;
	
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	public String adding() {
		return coffee.adding();
	}

}
