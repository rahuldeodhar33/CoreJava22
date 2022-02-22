package Package1;
import java.util.Scanner; 
public class NumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input numbers :");
		
		int num = scanner.nextInt();		
		if(num%2==0){
			System.out.println("This is even Number.");
		}else if(num%2!=0) {
			System.out.println("This is Odd Number.");
		}
		else {
			System.out.println("Yo have not entered any number");
		}
		scanner.close();
	}

}
