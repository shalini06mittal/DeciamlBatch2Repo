package oops;
// classes are blueprint/ basic structure
public class Product {

	// pid, pname, description, price
	// instance variable or data members
	// access specifier to secure the data
	private int pid;
	private String pname;// laptop , bluetooth
	private String description;
	private double price;
	// instance methods or member methods
	public void initialize(int pid, String pname, // arguments of methods are always local variables 
			String description, double price)// dollars
	{
		// local variables and instance variables have same name
		// then use this to distinguish instance from local
		this.pid = pid;
		this.pname = pname;
		this.description =description;
		this.price = price * 70;
	}
	/*
	 * 1) security
	 * 2) apply validations
	 * 3) role based authorization
	 * 4) logs
	 */
	public void setPrice(double price)
	{
//		if(loggedinuser is not admin)
//			throw notauthorizedexception
		this.price = price * 70;
	}
	public void display()
	{
		System.out.println("Id "+pid);
		System.out.println("name "+pname);
		System.out.println("Desc "+description);
		System.out.println("Price "+price);
	}
}
