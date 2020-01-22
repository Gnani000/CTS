package pack;

import java.util.*;
public class student {
	private String name;  
	private int id;
	private List<String> mobile;
	
	public void disp()
	{
		System.out.println("id :"+this.id+"\n"+"name :"+this.name);
		Iterator i= mobile.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

	public student(String name, int id, Address a) {
		this.name = name;
		this.id = id;
	}

	public student(String name, int id, List <String> mobile) {
		this.name = name;
		this.id = id;
		this.mobile = mobile;
	}

}
