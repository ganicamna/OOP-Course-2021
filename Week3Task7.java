import java.util.ArrayList;

public class Week3Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
		list.add("Moi");
		list.add("badger");
        ArrayList<Integer> lengths = lengths(list);
        System.out.print("The lengths of the strings: " + lengths);
	}
	public static ArrayList<Integer> lengths (ArrayList<String> list){
		ArrayList<Integer> len = new ArrayList<Integer>();
		
		for (String word : list) {
			int x = word.length();
			len.add(x);
		}
		return len;
	}

}
