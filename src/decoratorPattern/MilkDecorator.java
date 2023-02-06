package decoratorPattern;

public class MilkDecorator extends Decorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String adding() {
        // TODO Auto-generated method stub
        return super.adding() + " + Milk";
    }
}
