package Collections;
import java.util.LinkedList;
import java.util.Collections;
public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Link List example
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Pallav");
		list1.add("Palash");
		list1.add("Rahul");
		list1.addFirst("Nitin");
		list1.addLast("Kalyan");
		list1.add(2, "Yogini");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println("Reversing data in Linked List ");
		System.out.println(list1);
		}

}
