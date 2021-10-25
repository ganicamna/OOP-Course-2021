import java.util.Scanner;

public class Week3Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
	    System.out.print("Type your name: ");
	    String name = reader.nextLine();
	    int len = name.length();
	    for (int i = len-1; i>=0; i--) {
	    	char letter = name.charAt(i);
	    	System.out.println(letter);}
	}

}
