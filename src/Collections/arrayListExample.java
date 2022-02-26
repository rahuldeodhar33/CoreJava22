package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList1 = new ArrayList<String>();
		arrList1.add("RAJ");
		arrList1.add("Priya");
		arrList1.add("Manoj");
		arrList1.add("Sonal");
		System.out.println("Size of arry list is : " + arrList1.size());
		arrList1.remove(2);
		System.out.println("Size of arry list is : " + arrList1.size());
		arrList1.add(1, "MMT");
		
		System.out.println("Size of arry list is : " + arrList1.get(2));
		System.out.println(arrList1);
		for (int index=0;index<arrList1.size();index++) {
			System.out.println(arrList1.get(index));	
		}
		for (String name:arrList1) {
			System.out.println("different for Loop : " + name);
		}
		Iterator<String> itr = arrList1.iterator();
		while (itr.hasNext()) {
			System.out.println ("Using iterator : " + itr.next());
			
		}
		Collections.sort(arrList1);
		System.out.println("Alphabetical sort order " + arrList1);
	}
	
}

