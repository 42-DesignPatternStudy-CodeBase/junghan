package statePattern;

public class MainBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		PlayerLevel beginner = new BeginnerLevel();
		PlayerLevel advanced = new AdvancedLevel();
		PlayerLevel superl = new SuperLevel();
		player.play(1);
		player.upgradeLevel(beginner);
		player.getLevel();
		player.play(2);
		player.upgradeLevel(advanced);
		player.getLevel();
		player.play(3);
		player.upgradeLevel(superl);
		player.getLevel();
		player.play(4);
	}

}
