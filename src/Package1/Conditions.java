package Package1;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		
		int age = scanner.nextInt();
		
		if(age>=18) {
			System.out.println("You are going for voting.");
		}else if(age==17) {
				System.out.println("You can go for voting next Year.");
		
		}	else {
				System.out.println("You are not going for Voting until informed.");
			}
	scanner.close();
	}

}
