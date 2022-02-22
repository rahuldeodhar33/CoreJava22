package Package1;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {10,20,30,40,50};
		
		System.out.println("Length of array is : " + num1.length);
		System.out.println("Value at 3rd position is " + num1[2]);
		System.out.println("Last value in array is " + num1[num1.length -1 ]);
		
		String[] name1 = {"Rahul" , "Manoj" , "Mandar" , "Shailesh"};
		
		System.out.println("Arrey of words " + name1[0]);
		String name = "Clean India Green India";
		
		String[] arrWord = name.split(" ");
		System.out.println("Value at 3rd Position is : " + arrWord[2]);
		System.out.println("Total num of words are : " + arrWord.length);
		
		
		
	}

}
