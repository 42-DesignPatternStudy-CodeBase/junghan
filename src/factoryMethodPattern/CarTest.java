package factoryMethodPattern;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarFactory test = new CarFactory();
		Car car = test.produceCar("Sonata");
		System.out.println(car);
	}

}


