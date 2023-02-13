package statePattern;

public class MainBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();

		player.play(1);
		player.upgradeLevel();
		player.getLevel();
		player.play(2);
		player.upgradeLevel();
		player.getLevel();
		player.play(3);
		player.upgradeLevel();
		player.getLevel();
		player.play(4);
	}

}
