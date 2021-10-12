import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if(number>0) {
        	System.out.println("Number is positive!");
        }else {
        	System.out.println("Number is not positive!");
        }
	}

}
