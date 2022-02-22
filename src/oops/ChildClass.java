package oops;

public class ChildClass extends Person{
	String Profession;
	public ChildClass() {
		System.out.println("Inside child class");
	}
	public ChildClass(String Name, int Age, String Profession) {
		super(Name,Age);
		this.Profession = Profession;
	}
	public void Display(){
		
		System.out.println("My Name is : " + name);
		System.out.println("My Age is : " + age);
		System.out.println("My Profession is : " + Profession);
		//super.Display();
	}
	public void Display1() {
		super.Display1();
		System.out.println("This is method overriding2");
	}
}
