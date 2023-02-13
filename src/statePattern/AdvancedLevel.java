package statePattern;

public class AdvancedLevel extends PlayerLevel {
	
	AdvancedLevel() {
		this.level = ADVANCED_LEVEL;
	}
	
	public int getlevel() {
		return this.level;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("높이 jump 합니다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("Turn 할 줄 모르지롱.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("나는 " + level + ":어드밴스레벨 입니다. ");
	}; 


}
