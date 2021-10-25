import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Week3Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		while(true) {
			System.out.println("Enter new word: ");
			String neww = reader.nextLine();
			
			if(words.contains(neww)) {
				System.out.println("Your word is already on the list");
				break;
			}
			words.add(neww);}
		System.out.println("Original order of array: " + words);
		Collections.sort(words);
		
		System.out.println("Alphabetical order: " + words);
	}

}
