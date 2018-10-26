package ch1.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class MyContainer {
 public static void main(String[] args)
 {
	 ApplicationContext context = new ClassPathXmlApplicationContext("lab3.xml");
	 Person person = (Person)context.getBean("person");
	 person.displayDetail();
	 ((ClassPathXmlApplicationContext)context).close();
 }
}

