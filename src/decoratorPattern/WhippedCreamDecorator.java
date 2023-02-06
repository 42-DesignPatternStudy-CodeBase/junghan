package decoratorPattern;

public class WhippedCreamDecorator extends Decorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String adding() {
        // TODO Auto-generated method stub
        return super.adding() + " + WhippedCream";
    }
}
