package observerPattern;

public class GraphObserver implements Observer{

    private int number;
    
    @Override
    public void update(NumberGenerator generator) {
        number = generator.getNumber();
        display();
    }

    public void display() {
    	System.out.print("Graph Observer: ");
        for (int i = 0; i < number; i++) {
        	System.out.print("@");
        }
        System.out.println("");
    }
}
