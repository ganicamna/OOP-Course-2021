import java.util.Scanner;

public class Week2Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String password = "IBU";
       Scanner reader = new Scanner(System.in);
       while(true) {
    	   System.out.print("Type a password: ");
    	   String x = reader.nextLine();
    	   if(x.equals(password)) {
    		   System.out.println("Right!");
    		   System.out.println("The secret is: jryy qbar!");
    		   break;
    	   }else{
    		   System.out.println("Wrong!");
    		   continue;
    	   }
       }
	}

}
