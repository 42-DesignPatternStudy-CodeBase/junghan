package statePattern;

public class BeginnerLevel extends PlayerLevel {
	
	BeginnerLevel() {
		this.level = BEGINNER_LEVEL;
	}
	
	public int getlevel() {
		return this.level;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Jump 할 줄 모르지롱.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("Turn 할 줄 모르지롱.");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("나는 " + level + ":비기너레벨 입니다. ");
	}
	

}
