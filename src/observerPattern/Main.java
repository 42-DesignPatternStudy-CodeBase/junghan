package observerPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 NumberGenerator generator = new RandomNumberGenerator();
		 
	     Observer observer1 = new DigitObserver();
	     Observer observer2 = new GraphObserver();
	     Observer observer3 = new GraphObserver();
	        
	     System.out.println("========Test1=======");
	     
	     generator.addObserver(observer1);
	     generator.addObserver(observer2);
	     generator.addObserver(observer3);
	     generator.execute();

	     System.out.println("========Test2=======");

	     generator.deleteObserver(observer2);
	     generator.execute(); 
	}

}