import java.util.Scanner;

public class Week2Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("How many times: ");
 	    int x = reader.nextInt();
 	    printStars(x);
	}
	public static void printStars(int amount) {
		int i = 0;
		while(i<amount){
			System.out.print("*");
			i++;
		}
	}

}
