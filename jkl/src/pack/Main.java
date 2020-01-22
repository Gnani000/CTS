package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext b=new ClassPathXmlApplicationContext("applicationcontext.xml");
		//BeanFactory b= new XmlBeanFactory(new ClassPathResource("applicationcontext.xml"));
		A a1=(A)b.getBean("a");
		a1.setMessage("Welcome to Spring core scopes");
		a1.getMessage();
		A b1=(A)b.getBean("a");
      //  b1.setMessage("Welcome to Spring AOP");
        b1.getMessage();
	}

}
