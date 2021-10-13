import java.util.Scanner;

public class Week2Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		System.out.print("Type the first number: ");
 	    int x = reader.nextInt();
 	    System.out.print("Type the second number: ");
	    int y = reader.nextInt();
	    System.out.print("Type the third number: ");
	    int z = reader.nextInt();
	    sum = x+y+z;
	    System.out.print("Sum is: "+ sum);
	}

}
