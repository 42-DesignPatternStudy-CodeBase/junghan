package observerPattern;

public class DigitObserver implements Observer{

    private int number;
    
    @Override
    public void update(NumberGenerator generator) { 
        number = generator.getNumber(); // getter를 통한 push 방식으로 구현 
        display();
    }

    public void display() {
        System.out.println("Digit Observer: " + number);
    }
}