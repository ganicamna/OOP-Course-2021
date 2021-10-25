import java.util.Scanner;

public class Week3Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
	    System.out.println("Enter 2 words: ");
	    String w1 = reader.nextLine();
	    String w2 = reader.nextLine();
	    int index2 = w1.indexOf(w2);
	    if(index2>=0) {
	    	System.out.print("The word " + w2 + " is found in the word " + w1);
	    }else {
	    	System.out.print("The word " + w2 + " is not found in the word " + w1);
	    }
	}

}
