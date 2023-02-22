package observerPattern;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        number = random.nextInt(42) + 1; // 1 ~ 42     
        super.notifyObservers();
    }
}