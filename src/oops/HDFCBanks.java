package oops;

//cannot create object of abstract class which is bankExample but we can create object of HDFCBanks which is child class.
//Abstraction example
public class HDFCBanks extends bankExample{

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositeMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		
	}

	public void CreditCard() {
		System.out.println("Get HDFC Credit Card");
	}
}
