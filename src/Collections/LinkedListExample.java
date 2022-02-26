package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> Lst1 = new LinkedList<String>();
		Lst1.add("TEST1");
		Lst1.add("TEST2");
		Lst1.add("TEST3");
		Lst1.add("TEST4");
		System.out.println(Lst1);
		for (String name:Lst1) {
			System.out.println("different for Loop : " + name);
		}
		
	}

}
