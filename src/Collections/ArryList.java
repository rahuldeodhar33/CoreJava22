package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generate array and its elements...
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Rahul"); //index 0
		arrList.add("Manohar"); //index 1
		arrList.add("Deodhar"); //index 2
		arrList.add("something"); //index 3
		arrList.add("Can");
		for (int index=0;index < arrList.size();index++) {
			System.out.println(arrList.get(index));
		}
		for (String name : arrList)
		{
			System.out.println(name);
		}
		Iterator<String> etr = arrList.iterator();
		while (etr.hasNext()) {
			System.out.println(etr.next());
		}
		System.out.println("Size of array list is " + arrList.size());
		System.out.println(arrList);
		System.out.println("We are removing " + arrList.get(3) + " from our arrayList");
		arrList.remove(3);
		System.out.println("Now Size of array list is " + arrList.size());
		System.out.println(arrList);
		System.out.println("We are also removing " + arrList.get(3) + " from our arrayList");
		arrList.remove(3);
		System.out.println(arrList);
		System.out.println("Now Size of array list is " + arrList.size());
		//Important : use get function to replace the elements from array list
		arrList.set(0, "Pallav");
		//reverse printing of array
		System.out.println("First Name is replaced with " + arrList.get(0));
		System.out.println(arrList);
		for (int index=arrList.size()-1; index >= 0 ; index--) {
			System.out.println(arrList.get(index));
			System.out.println(" This is from for loop " + index);
		}
		Collections.sort(arrList);
		System.out.println(arrList);
	}

}
