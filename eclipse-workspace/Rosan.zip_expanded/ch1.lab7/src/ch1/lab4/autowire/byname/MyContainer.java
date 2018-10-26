package ch1.lab4.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class MyContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("lab4.xml");
		Student student = (Student)context.getBean("student");
		System.out.print(" Student Id= " + student.getId() + "Studnet Name=" + student.getName()+ 
		"Hostel Name="+ student.getHostel().getHostelName()+ "Hostel City=" +student.getHostel().getCity());
	
		((ClassPathXmlApplicationContext)context).close();
	}
	

}
