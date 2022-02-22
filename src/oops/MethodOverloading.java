package oops;

public class MethodOverloading {
	public void sum (int a, int b) {
		 int result = a+b;
		 System.out.println("Sum of two numbers : " + result);
	 }
	 public void sum (int a, int b, int c) {
		 int result = a+b+c;
		 System.out.println("Sum of Three numbers : " + result);
	 }

}
