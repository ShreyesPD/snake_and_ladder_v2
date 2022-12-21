package client;

import board.Board;
import word_find.WordFind;

public class ClientApp {

	public static void main(String[] args) {

		WordFind wordFinder = new WordFind();
//		
//		
//		System.out.println(wordFinder.patternSearch("CANCER"));
		
		Board b=new Board();
		
		wordFinder.printWordGrid();
	}

}
