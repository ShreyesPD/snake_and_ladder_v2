package word_find;

import java.util.ArrayList;
import java.util.List;
import dataLoadUtility.DataLoadUtility;
import java.util.Random;

public class  WordFind {
	ArrayList<String> wordList;
	
	public WordFind() {
		this.wordList = DataLoadUtility.dataload("./words");
	}
	
    public int patternSearch(String key) {
    	
    	for (String word:wordList) {
    		if (word.toLowerCase().equals(key.toLowerCase()))
    			return key.length();
    	}
    	
        return 0;
    }
    
    public void printWordGrid() {
    	Integer row = 0, col = 0;
		Integer max = 9;
		Integer min = 0;
    	char[][] grid = new char[10][10];
    	for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				grid[i][j] = '?';
			}
			System.out.println();
		}
    	
		for (String s : wordList) {
			
			
			
			int srow = ((int) Math.floor(Math.random() * (max - min + 1)));
			int scol = (int) Math.floor(Math.random() * (max - min + 1));
			
				col =0;
				for (char c : s.toCharArray()) {

					if (grid[srow][col] == '?') {
						grid[srow][col++] = c;

					}
				}
			
			
			
			
			row=0;
			
			for (char c : s.toCharArray()) {

				if (grid[row][scol] == '?') {
					grid[row++][scol] = c;

				}
			}
			
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Random rnd = new Random();
				if (grid[i][j] == '?') {
					grid[i][j] = (char) ('A'+rnd.nextInt(26));
				}
				
				
			}
			System.out.println();
		}
    	
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("  " + grid[i][j]);
			}
			System.out.println();
		}
	}
}
