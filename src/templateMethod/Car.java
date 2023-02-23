package templateMethod;

public abstract class Car {
	final void startCar(){
        System.out.println("시동을 켭니다.");
    };
	abstract public void drive();
	abstract public void stop();
	final void turnOff(){
        System.out.println("시동을 끕니다.");
    };

	final void run() { //override 불
		startCar();
		drive();
		stop();
		turnOff();
	};
}