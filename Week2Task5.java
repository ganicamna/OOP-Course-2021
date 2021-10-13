import java.util.Scanner;

public class Week2Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");
 	    int x = reader.nextInt();
 	    int sum = 0;
 	    for(int i=0; i<=x; i++) {
 	    	sum = sum + (int)Math.pow(2,i);
 	    }
 	   System.out.print("The result is: " + sum);
	}

}
