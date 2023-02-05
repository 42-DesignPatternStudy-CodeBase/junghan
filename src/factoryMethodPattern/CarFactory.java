package factoryMethodPattern;

public class CarFactory implements Factory {
	
	@Override
	public Car produceCar(String name) {
		Car car = null;
		if( name.equalsIgnoreCase(Car.SONATA)) {
			car = new Sonata(name);
		} 
		else if( name.equalsIgnoreCase(Car.GRANDEUR)) {
			car = new Grandeur(name);
		}
		else if( name.equalsIgnoreCase(Car.GENESIS)) { 
			car = new Genesis(name);
		}
		return car;
	}

}
