import java.util.Scanner;

public class Week3Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
	    System.out.print("Enter four numbers:  ");
	    int x = reader.nextInt();
	    int y = reader.nextInt();
	    int z = reader.nextInt();
	    int w = reader.nextInt();
	    double answer = average(x,y,z,w);
	    System.out.println("Average value is: " + answer);
	}
	public static double average(int num1, int num2, int num3, int num4) {
		int sum = 0;
		int avg;
		sum = num1 + num2 + num3 + num4;
		avg = sum/4;
		return avg;
	}

}
