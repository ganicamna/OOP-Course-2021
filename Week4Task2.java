
public class Week4Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dice dice = new Dice(6);
        
        int i = 0;
        while(i < 10) {
        	System.out.println(dice.roll());
        	i++;}
	}

}
