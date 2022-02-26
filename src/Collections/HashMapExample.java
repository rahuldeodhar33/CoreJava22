package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hash1 = new HashMap<Integer,String>();
		
		hash1.put(12, "Rahul");
		hash1.put(22, "Mandar");
		System.out.println(hash1);
		hash1.put(3, "Nitin");
		System.out.println(hash1);
		//Linked Hash map
		LinkedHashMap<Integer,String> LH1 = new LinkedHashMap<Integer,String>();
		LH1.put(31, "Manoj");
		LH1.put(44, "Rahul");
		LH1.put(3, "Mandar");
		System.out.println(LH1);
		//Tree Map
		TreeMap<Integer,String> TM1 = new TreeMap<Integer,String>();
		TM1.put(39, "Manoj");
		TM1.put(121, "Rahul");
		TM1.put(33, "Mandar");
		System.out.println(TM1);

		for(Entry<Integer, String> entry1 : hash1.entrySet()) {
			
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
			
		}
		for (int val : hash1.keySet()) {
			
			System.out.println("Key is : " + val);
		}
		for (String val : hash1.values()) {
			System.out.println("String is : " + val);
		}
	
	//String str1 = "Clean India, Green India, ever green india,";
	
	//TreeMap<String, Integer> TM2 = new TreeMap<String, Integer>();
	
	
	}
	
	
	
	
	

}
