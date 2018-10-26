package ch1.lab3;

public class Person {
	Car car;
	String pName;
	
	public Person(Car car, String pName)
	{
		System.out.println("Inside Person Constructor");
		this.car=car;
		this.pName = pName;
	}
	public void displayDetail()
	{
		System.out.println("Person Name="+ pName);
		car.displayCarDetails();
	}
}
