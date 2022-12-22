import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import snakeAndLadder.entities.Board;
import snakeAndLadder.entities.BoardEntity;
import snakeAndLadder.entities.Player;
import snakeAndLadder.word_find.WordFind;

public class Game{
    Board board;
	Queue<Player> players;
	Queue<Player> winners;
	int size = 100;
	WordFind wordFinder;
	
	public Game() {
		this.wordFinder = new WordFind();

		board = new Board(10);
		players = new LinkedList<Player>();
		winners = new LinkedList<Player>();
		
	}

    public Queue<Player> getPlayers() {
		return players;
	}

	public void addPlayer(Player player) {
		this.players.add(player);
	}

	public Queue<Player> getWinners() {
		return winners;
	}

	public void setWinners(Queue<Player> winners) {
		this.winners = winners;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}