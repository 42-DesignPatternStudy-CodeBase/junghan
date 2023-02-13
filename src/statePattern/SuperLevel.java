package statePattern;

public class SuperLevel extends PlayerLevel{
	
	SuperLevel() {
		this.level = SUPER_LEVEL;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("아주 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("한 바퀴 돕니다.");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("나는 " + level + ":수퍼레벨 입니다. ");
	}; 

}
