package decoratorPattern;

public class WaterDecorator extends Decorator {
    public WaterDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String adding() {
        // TODO Auto-generated method stub
        return super.adding() + " + Water";
    }
}
