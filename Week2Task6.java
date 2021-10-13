import java.util.Scanner;

public class Week2Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("How many times: ");
 	    int x = reader.nextInt();
 	    int i = 0;
 	    while(i<x) {
 	    	printText();
 	    	i++;
 	    }
 	 }
 	  public static void printText() {
 		 System.out.println("In the beginning there were the swamp, the hoe and Java.");
 	  
	}

}
