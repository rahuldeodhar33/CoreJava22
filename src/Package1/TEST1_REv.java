package Package1;

public class TEST1_REv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rev printing number
		int num1= 12345678;
		int rev=0;
		
		while (num1>0) {
			int rem1 = num1%10;
			rev = rev*10+rem1;
			num1=num1/10;
		}
		System.out.println("The reversed number is : " + rev);
		
		// prime number
		

	}

}
