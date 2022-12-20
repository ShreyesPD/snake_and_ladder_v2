package word_find;

import java.util.List;

public class  WordFind {
	List<String> wordList;
	
	public WordFind() {
		this.wordList = DataLoadUtility.dataload("./words");
	}
	
    public int find(String key) {
    	
    	for (String word:wordList) {
    		if (word.toLowerCase().equals(key.toLowerCase()))
    			return key.length();
    	}
    	
        return 0;
    }
}
