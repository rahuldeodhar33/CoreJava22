package oops;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*employee emp1 = new employee();
		emp1.name = "Rahul Deodhar";
		emp1.empID = 2210;
		emp1.sal = 25000;
		
		employee emp2 = new employee();
		emp2.name = "Pallav Deodhar";
		emp2.empID = 2211;
		emp2.sal = 27000;
		
		//System.out.println("Employee One is " + emp1.name);
		//System.out.println("Employee Two is " + emp2.name);
		emp1.PrintName();
		emp2.PrintName();
		*/
		//need to create object and initialized this 
		employee emp1 = new employee("Manoj",111,12000);
		employee emp2 = new employee("Mandar",222,13000);
		System.out.println("This is employee one Recrods : ");
		employee.ChangeCompName();
		emp1.PrintAll();
		emp1.Comp();
	
		System.out.println("	");
		System.out.println("This is employee two Recrods : ");
		emp2.PrintAll();
		emp2.Comp();
		Person per1 = new Person("Sameer",25);
		//System.out.println("Executed using Parent class");
		ChildClass child2 = new ChildClass("Rahul",38,"Engineer");
		//per1.Display();
		//child2.Display();
		//2.Display1();
		child2.Display1();
		child2.Display();
		//Create a object of child class using reference of parent class, example
		Person child3 = new ChildClass("Manoj",35,"Doctor");
		//child3.Display();
		Person per2 = new ChildClass();
		//when we initialise the object of class then it actually going in that class's default constructor. Above line is example of same.
		MethodOverloading test = new MethodOverloading();
		test.sum(12,18);
		test.sum(14, 16, 0);
		
		HDFCBanks bank1 = new HDFCBanks();
		bank1.CreditCard();
		bank1.welcome();
	
		EncapsulationExample obj10 = new EncapsulationExample();
		obj10.setName1("Rahul");
		System.out.println(obj10.getName1());
	}
}
