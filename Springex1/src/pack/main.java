package pack;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
public class main {

	public static void main(String[] args) {
        BeanFactory b= new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
        student d=(student)b.getBean("s");
	   d.disp();
	}

}
