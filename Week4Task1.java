import java.util.ArrayList;

public class Week4Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(4);
		list1.add(3);
		
		list2.add(5);
		list2.add(10);
		list2.add(7);
		
		System.out.println("List1: " + list1);
		System.out.println("List2: " + list2);
		
		combine(list1,list2);
		
		System.out.println("List1: " + list1);
		System.out.println("List2 after combining: " + list2);
		
	}
	public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
	    second.addAll(first);
	}
}
