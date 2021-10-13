import java.util.Scanner;

public class Week2Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("First: ");
 	    int x = reader.nextInt();
 	    System.out.print("Second: ");
	    int y = reader.nextInt();
	    int i = x;
	    while(i<=y) {
	    	System.out.println(i);
	    	i++;
	    }
	}

}
