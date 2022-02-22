package oops;

public class employee {

	String name;
	int sal;
	int empID;
	String Comp = "FIS";
	//Static belong to class and does not need to create object of this and can be access with class name
	public static String CompName = "";
	
	
	//constructor 
	public employee (String Name,int Sal,int EmpID) {
		this.name=Name;
		this.empID=EmpID;
		this.sal=Sal;		
	}
	
	//Normal Method example  and call this in runner class to print name with object
	public void PrintAll() {
		System.out.println("Employee Name is : " + name);
		System.out.println("Employee Sal is : " + sal);
		System.out.println("Employee empid is : " + empID);
	}
	public void Comp() {
		System.out.println("Employee Company Name is : " + Comp);
		System.out.println("Employee NEW Company Name is : " + employee.CompName);
		}
	
	public static void ChangeCompName() {
		employee.CompName="Fidility Information Services";
	
	}
}
