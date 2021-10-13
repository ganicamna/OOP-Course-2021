import java.util.Random;
import java.util.Scanner;

public class Week2Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Random rand = new Random();
       int upperb = 101;
       int x = rand.nextInt(upperb);
       
       while(true) {
    	   int i = 1;
    	   Scanner reader = new Scanner(System.in);
   		   System.out.println("Guess the number: ");
    	   int y = reader.nextInt();
    	   
    	   if(y<x) {
    		   System.out.println("The number is greater, guesses made: " + i);
    		   i++;
    	   }else if(y>x){
    		   System.out.println("The number is lesser, guesses made: " + i);
    		   i++;
    	   }else if(y==x){
    		   System.out.println("Congrats, that's right!");
    		   break;
    	   }
       }
	}

}
