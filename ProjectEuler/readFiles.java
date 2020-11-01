package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFiles {
	private Scanner x;
	public void openFile() {
		try {
			x = new Scanner(new File("names.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("couldn't find file");
		}
	}
	public void readFile() {
		
	}
}
