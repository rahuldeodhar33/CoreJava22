package Package1;

public class LoopClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		// while loop to print 1 to 10 without 5
		while(num1<=10) {
			if(num1==5) {
				num1 = num1 + 1;
				continue;
			}
			System.out.println("Number is " + num1);
			num1 = num1 + 1;
		}
		
		//for Loop
		
		for(int num = 10;num>=1;num--) {
			
			if(num==5) {
				System.out.println("Inside for loop " + num);
				break;
				
			}
			System.out.println("Inside for loop " + num);
		}
		
		//For loop with array
		
		int[] arr1 = {10,20,30,40,50};
		
		for (int index=0;index<arr1.length;index++) {
			
			System.out.println("Value inside array int is : " + arr1[index]);
		}
		//Enhanced for loop or for each loop
		for (int val:arr1) {
			System.out.println("Another way printing array : " + val);
		}
		
	}

}
