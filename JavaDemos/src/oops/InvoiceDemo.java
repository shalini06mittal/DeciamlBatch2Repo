package oops;

public class InvoiceDemo {

	public static void main(String[] args) {
		
		// diff product objects
		// new
		int a[] = new int[3];
		// heap
		Product p1 = new Product();// could initialize the values
		// . operator is used to access the members of a class in another class
		p1.initialize(1,"Laptop","Apple MAC", 1000);
		Product p2 = new Product();
		// . operator is used to access the members of a class in another class
//		p2.pid = 2;
//		p2.pname = "Laptop";
//		p2.description ="Microsoft Windowx 10";
//		p2.price = 70000;
		p2.initialize(2,"Bluetooth","Jab with distance", 150);
		p1.display();
		p2.display();
		Product p3 = new Product();
		p3.initialize(3, "Mouse", "Wireless", 250);
		//p3.price = 120;// my data is insecured
		p3.setPrice(120);
		p3.display();
		

	}

}
