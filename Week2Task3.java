import java.util.Scanner;

public class Week2Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("Type a number: ");
			int read = reader.nextInt();
			if(read==0) {
				break;
			}sum = sum + read;
			System.out.println("Sum now is: " + sum);
		}
		System.out.println("Sum in the end is: " + sum);
	}

}
