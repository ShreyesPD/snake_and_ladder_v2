package client;

import entities.Player;
import game.Game;

public class ClientApp {

	public static void main(String[] args) {

		Game game= new Game();
		game.addPlayer(new Player("🧔"));
		game.addPlayer(new Player("👩🏻"));
		game.launch();
	}

}
