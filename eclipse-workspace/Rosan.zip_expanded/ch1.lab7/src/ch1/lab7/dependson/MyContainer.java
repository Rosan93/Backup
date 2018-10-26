package ch1.lab7.dependson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyContainer 
{

	public static void main(String args[]) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("lab7.xml");
		((ClassPathXmlApplicationContext)context).close();
	}
}
