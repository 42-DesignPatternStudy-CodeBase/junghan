package observerPattern;

public class DigitObserver implements Observer{

    private int number;
    
    @Override
    public void update(NumberGenerator generator) {
        number = generator.getNumber();
        display();
    }

    public void display() {
        System.out.println("Digit Observer: " + number);
    }
}