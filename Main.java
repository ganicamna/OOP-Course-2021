import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        /*HashMap<String, String> names = new HashMap<String, String>();
        
        names.put("matt", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");
        
        System.out.println(names.get("mikael"));*/
		
		/*PromissoryNote mattisNote = new PromissoryNote();
		mattisNote.setLoan("Arto", 50);
		mattisNote.setLoan("Mikael", 5);
		
		System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
		System.out.println(mattisNote.howMuchIsTheDebt("Mikael"));
		
		mattisNote.setLoan("Arto", 30);
		System.out.println(mattisNote.howMuchIsTheDebt("Arto"));*/
		
		/*Dictionary dictionary = new Dictionary();
		dictionary.addWord("apina","monkey");
		dictionary.addWord("cembalo","harpischord");
		dictionary.addWord("banaani","banana");
		
		System.out.println(dictionary.translate("apina"));
		System.out.println(dictionary.translate("porkkana"));
		
		System.out.println(dictionary.amountOfWords());

        ArrayList<String> translations = dictionary.translationList();
        for (String key : translations) {
        	System.out.println(key);
        }*/
	       Dictionary dictionary = new Dictionary();
	       
	       TextUserInterface ui = new TextUserInterface(reader, dictionary);
	       ui.start();
	}

}
