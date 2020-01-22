package bean;

public class BeanClass1 {
    private String message;

	public void getMessage() {
		System.out.println("Hi " +message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init()
	{
		System.out.println("Inside Init");
	}
	public void destroy()
	{
		System.out.println("Inside Destroy");
	}

}
