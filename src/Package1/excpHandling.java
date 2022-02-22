package Package1;

public class excpHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		
		try {
			int result = num/0;			
		}catch(ArithmeticException e) {
			
			System.out.println("Inside catch1 block: Exception/error is ");
			System.out.println(e);
		}
		catch(Exception e) {
			
			System.out.println("Inside Final catch block: Exception/error is ");
			System.out.println(e);
			
		}
		System.out.println("After try catch");
	}

}
