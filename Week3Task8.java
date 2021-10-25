import java.util.Scanner;

public class Week3Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
	       String word = reader.nextLine();
	       int len = word.length();
	       int counter = 0;
	       for (int i=0; i<len; i++) {
	    	   if(word.charAt(i)!=word.charAt(len-1-i)) {
	    		   System.out.println("It is not a palindrome!");
	    		   break;
	    	   }else {
	    		   counter++;
	    	   }
	       }
	       if(counter==len/+1) {
	       System.out.println("It is a palindrome!"); }
	}

}
