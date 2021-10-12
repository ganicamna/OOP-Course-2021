import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        if(number1>number2) {
        	System.out.println("First number is greater!");
        }else {
        	System.out.println("Second number is greater!");
        }
	}

}
