package board;

import java.util.HashMap;
import java.util.List;

import dataLoadUtility.DataLoadUtility;
import entities.BoardEntity;
import entities.Ladder;
import entities.Snake;

public class Board {

	HashMap<Integer, BoardEntity> cells;
	Integer cellCount;
	
	public Board(int dimention) {
		this.cellCount = dimention*dimention;
		cells = new HashMap<Integer, BoardEntity>();
		for(int i=0; i<dimention; i++) {
			Integer min = 2;
			Integer max = cellCount - 1;
			Integer start = (int) Math.floor(Math.random()*(max-min+1)+min);
			max = start - 1;
			Integer end = (int) Math.floor(Math.random()*(max-min+1)+min);
			if(!hasBoardEntity(start)) {
				setEntity(start, new Snake());
			}
			max = cellCount - 1;
			end = (int) Math.floor(Math.random()*(max-min+1)+min);
			max = end - 1;
			start = (int) Math.floor(Math.random()*(max-min+1)+min);
			if(!hasBoardEntity(start)) {
				setEntity(start, new Ladder());
			}
			
		}
	}
    
	public void print() {
	
	}

	private void setEntity(int index, BoardEntity e) {
		cells.put(index, e);
	}

	public boolean hasBoardEntity(int cellIndex) {
		return cells.containsKey(cellIndex);
	}
}
