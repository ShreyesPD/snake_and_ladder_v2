package game;

import java.util.LinkedList;
import java.util.Queue;

import board.Board;
import entities.BoardEntity;
import entities.Player;
import word_find.WordFind;

public class Game {
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

	private void makeMove(Player player, int move) {
		int currPosition = player.getPosition();

		if (move == 0) {
			System.out.println("Word Not Found!");
			return;
		}

		System.out.println("You got: " + move);
		int finalPos = currPosition + move;
		if (finalPos <= size) {
			if (board.hasBoardEntity(finalPos)) {
				BoardEntity boardEntity = board.getEntity(finalPos);

				if (boardEntity.getStart() == boardEntity.getEnd()) {
					boardEntity.setEnd(boardEntity.getStart() + (move * 2));
				}
				System.out.println(boardEntity.getEncounterMessage());
				finalPos = boardEntity.getEnd();
			}
			System.out.println("Taking you to " + finalPos);
		} else {
			finalPos = this.size;
		}

		player.setPosition(finalPos);

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