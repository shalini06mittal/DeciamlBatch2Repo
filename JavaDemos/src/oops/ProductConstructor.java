package oops;

// that represent information are called as POJO, bean, component, 
public class ProductConstructor {

	private int pid;
	private String pname;
	private String description;
	private double price;
	/**
	 * constructors are
	 * 1) special methods with the name same as class name
	 * 2) they do not have a return type
	 * 3) they are invvoked automatically when the object of the class is created
	 * 4) cannot use . operator to access the constructor
	 * 5) they are used to initialize the data members of the class
	 */
	public ProductConstructor() {
		// TODO Auto-generated constructor stub
		System.out.println("Product default constructor");// default as it takes no parameters
	}
	
	
	public ProductConstructor(int pid, String pname, 
			String description, double price) {
		// parameterized as it takes parameters
		System.out.println("Product parameterized constructor");
		this.pid = pid;
		this.pname = pname;
		this.description = description;
		this.price = price;
	}

	// getters => accessors => fetches or returns the vale
	
	public int getPid() {
		return this.pid;
	}
	
	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	// setters => mutators => updates the value
	public void setPid(int pid) {
		this.pid = pid;
	}


	@Override
	public String toString() {
		return "Id=" + pid + "\nProduct Name=" + pname + "\nDescription=" + description + "\nPrice="
				+ price ;
	}
	
//	public void display()
//	{
//		System.out.println("Id "+pid);
//		System.out.println("name "+pname);
//		System.out.println("Desc "+description);
//		System.out.println("Price "+price);
//	}
}
