package factoryPattern.questionCode;

//다음 코드를 상속과 Factory pattern 을 이용하여 리펙토링 하세요

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarTest test = new CarTest();
		Car car = test.produceCar("Sonata");
		System.out.println(car);
	}
	
	public Car produceCar(String name) {
		Car car = null;
		if( name.equalsIgnoreCase(Car.SONATA)) {
			car = new Car(Car.SONATA);
		} 
		else if( name.equalsIgnoreCase(Car.GRANDEUR)) {
			car = new Car(Car.GRANDEUR);
		}
		else if( name.equalsIgnoreCase(Car.GENESIS)) { 
			car = new Car(Car.GENESIS);
		}
		else {
			car = new Car("noname");
		} 
		return car;

	}

}


