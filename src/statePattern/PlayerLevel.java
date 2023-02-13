package statePattern;

public abstract class PlayerLevel {
	public static final int BEGINNER_LEVEL = 1;
	public static final int ADVANCED_LEVEL = 2;
	public static final int SUPER_LEVEL = 3;
	
	protected int level;
	
	abstract public void run();
	abstract public void jump();
	abstract public void turn();
	
	abstract public void showLevelMessage();
	
	protected void go(int num) {;
		System.out.println(level + "가즈아");
	}
	protected abstract int getlevel();
}
