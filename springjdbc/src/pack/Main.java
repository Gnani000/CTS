package pack;

import java.util.*;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Main {  
  
public static void main(String[] args) {  
	
    ApplicationContext ap=new ClassPathXmlApplicationContext("ApplicationContext.xml");  
    studentDAO s1= (studentDAO)ap.getBean("s");
  /*  int count =s1.savestudent(new student(101,"Gnani"));
    System.out.println(count+"rows updated");
    int count=s1.updatestudent(new student(101,"Gnan"));
    System.out.println(count+"rows updated");
    int count=s1.deletestudent(new student(101));
    System.out.println(count+"rows updated");
    int count =s1.savestudent(new student(104,"jkl"));
    System.out.println(count+"rows updated");*/
    List<student> list=s1.getAllstudents();  
    
    for(student e:list)  
        System.out.println(e.getId()+" "+e.getName());  

}  
  
}