package templateMethod;

public abstract class Car {
	abstract public void startCar();
	abstract public void drive();
	abstract public void stop();
	abstract public void turnOff();

	final void run() { //override 불
		startCar();
		drive();
		turnOff();
		stop();
	};
}