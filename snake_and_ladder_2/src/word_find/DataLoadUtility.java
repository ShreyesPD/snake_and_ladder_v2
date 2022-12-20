package word_find;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoadUtility {
	public static List<String> dataload(String filepath) {

		Scanner s;
		List<String> wordList=new ArrayList<String>();

		try {
			File file2=new File(filepath);
			s=new Scanner(file2);
			while (s.hasNextLine()) {
				  wordList.add(s.next());
			}
		} catch (Exception e) {
			System.out.println("Caught an exception "+ e);
		}
		return wordList;
	}
}
