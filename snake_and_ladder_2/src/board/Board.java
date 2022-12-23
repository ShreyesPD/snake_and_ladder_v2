package board;

import java.util.HashMap;
import java.util.Queue;
import java.util.Random;

import entities.BoardEntity;
import entities.Freeze;
import entities.Hint;
import entities.Ladder;
import entities.Rocket;
import entities.Snake;
import entities.Trivia;
import entities.Player;
import entities.Reverse;

public class Board {

	HashMap<Integer, BoardEntity> cells;
	private Integer cellCount;

	public Board(Integer dimention) {
		this.cellCount = dimention * dimention;
		cells = new HashMap<Integer, BoardEntity>();
		for (int i = 0; i < dimention; i++) {

			 Integer min = 2;
			 Integer max = cellCount - 1;
			 Integer start = (int) Math.floor(Math.random() * (max - min + 1) + min);
			max = start - 1;
			Integer end = (int) Math.floor(Math.random() * (max - min + 1) + min);
			if (!hasBoardEntity(start)) {
				setEntity(start, new Snake(start, end));
			}

			max = cellCount - 1;
			end = (int) Math.floor(Math.random() * (max - min + 1) + min);
			max = end - 1;
			start = (int) Math.floor(Math.random() * (max - min + 1) + min);
			if (!hasBoardEntity(start)) {
				setEntity(start, new Ladder(start, end));
			}

			start = (int) Math.floor(Math.random() * (max - min + 1) + min);
			if (!hasBoardEntity(start)) {
				setEntity(start, new Freeze(start, 0));
			}

		}

		Random random = new Random();

		for (int i = 0; i < 3; i++) {
		    Integer position = random.nextInt(99);
			if (!hasBoardEntity(position)) {
				setEntity(position, new Reverse(position, -1));
			}
		}

		Integer position = random.nextInt(50);
		if (!hasBoardEntity(position)) {
			Rocket rocket = new Rocket(position);
			setEntity(rocket.getStart(), rocket);
		}

		Integer positionHint = random.nextInt(99);
		if (!hasBoardEntity(positionHint)) {
			Hint hint = new Hint(positionHint, -2);
			setEntity(hint.getStart(), hint);
		}

		Integer positionTrivia = random.nextInt(69);
		if (!hasBoardEntity(positionTrivia)) {
			Trivia trivia = new Trivia(positionTrivia, -3);
			setEntity(trivia.getStart(), trivia);
		}

	}

	public void print(Queue<Player> p) {
		for (int i = cellCount; i > 0; i--) {
			for (Player player : p) {
				// System.out.println(player.getUserName()+":"+player.getPosition());
				if (i == player.getPosition()) {
					System.out.print(player.getString());
					break;
				}
			}
			if (hasBoardEntity(i)) {
				System.out.print(cells.get(i).getString());
			} else {
				if (i == 1)
					System.out.print("🏠️");
				else if (i == 100)
					System.out.print("🏁️");
				else
					System.out.print(i + " ");
			}
			System.out.print("\t");

			if (i % 10 == 1) {
				System.out.println("\n");
			}
		}
		System.out.println();

	}

	private void setEntity(int index, BoardEntity e) {
		cells.put(index, e);
	}

	public BoardEntity getEntity(int index) {
		if (hasBoardEntity(index)) {
			return this.cells.get(index);
		}
		return null;
	}

	public boolean hasBoardEntity(int cellIndex) {
		return cells.containsKey(cellIndex);
	}
}
