package statePattern;

public class Player {
	
	PlayerLevel level;
	
	Player() {
		level = new BeginnerLevel();
	}
	
	void getLevel() {
		level.showLevelMessage();
	}
	
	void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	void play(int time) {
		level.run();

		for(int i =0; i< time; i++) {

		level.jump();

		} level.turn();
		
	}

}
