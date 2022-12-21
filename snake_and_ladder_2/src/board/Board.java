package board;

import java.util.List;

import dataLoadUtility.DataLoadUtility;

public class Board {
	List<String> wordList;
	public Board() {
		this.wordList = DataLoadUtility.dataload("./words");
	}
	
    
	public void print() {
		for (String word:wordList) {
    		System.out.println(word);
    	}
		 
	}
}
