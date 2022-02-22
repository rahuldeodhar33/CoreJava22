package oops;
public class Person {
	public Person() {
		System.out.println("Inside parent class.");
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String name;
	public int age;
	public void Display(){
		
		System.out.println("My Name is : " + name);
		System.out.println("My Age is : " + age);
			
	}
	public void Display1() {
		System.out.println("Method Overriding1");
	}
	
}

