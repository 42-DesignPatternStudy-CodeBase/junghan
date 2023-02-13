package factoryMethodPattern;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarFactory fac1 = new GenesisFactory();
		Car genesis = fac1.produceCar();
		System.out.println(genesis);
		
		CarFactory fac2 = new GrandeurFactory();
		Car grandeur = fac2.produceCar();
		System.out.println(grandeur);
		
		CarFactory fac3 = new SonataFactory();
		Car sonata = fac3.produceCar();
		
		System.out.println(sonata);
	}

}


