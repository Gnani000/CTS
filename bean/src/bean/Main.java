package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		//BeanFactory b= new XmlBeanFactory(new ClassPathResource("applicationcontext.xml"));
		BeanClass1 obj=(BeanClass1)context.getBean("b"); 
		obj.getMessage();
		context.registerShutdownHook();
	}

}
