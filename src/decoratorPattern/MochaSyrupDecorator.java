package decoratorPattern;

public class MochaSyrupDecorator extends Decorator{
    public MochaSyrupDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String adding() {
        // TODO Auto-generated method stub
        return super.adding() + " + MochaSyrup";
    }

}
