package ch1.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class MyContainer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lab2.xml");
		User obj = (User) context.getBean("user");
		System.out.println("Car Name=" + obj.getCar().getName() + "\nPer Day Price="+obj.getCar());
		((ClassPathXmlApplicationContext)context).close();

	}

}
