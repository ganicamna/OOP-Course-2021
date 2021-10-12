import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner reader= new Scanner(System.in);
        System.out.print("Type the first number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        int sum= number1+number2;
        System.out.println("The sum is: " + sum);
	}

}
