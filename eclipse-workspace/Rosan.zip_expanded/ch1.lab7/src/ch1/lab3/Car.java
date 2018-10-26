package ch1.lab3;

public class Car {
	String cName;
	float price;
	int oldornew;
	
	public Car(String cName, float price, int oldornew)
	{
		System.out.println("Inside Car Constructor");
		this.cName = cName;
		this.price = price;
		this.oldornew = oldornew;
	}
	
	public void displayCarDetails()
	{
		System.out.println("Car Name=" + cName + "Car Price="+price+"Old or New=" + oldornew);
	}
}
