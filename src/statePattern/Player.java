package statePattern;

public class Player {
	
	PlayerLevel level = new BeginnerLevel();
	
	Player() {
		this.level = new BeginnerLevel();
	}
	
	void getLevel() {
		this.level.showLevelMessage();
	}
	
	void upgradeLevel() {
		if (this.level.getlevel() == 3)
			System.out.println("이미 높은 레벨입니다.");
		else if (this.level.getlevel() == 2)
			this.level = new SuperLevel();
		else if (this.level.getlevel() == 1)
			this.level = new AdvancedLevel();
		else
			System.out.println("에러");
	}
	
	void play(int time) {
		level.run();

		for(int i =0; i< time; i++) {

		level.jump();

		} level.turn();
		
	}

}
