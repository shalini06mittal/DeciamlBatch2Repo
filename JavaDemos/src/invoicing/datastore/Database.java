package invoicing.datastore;

import invoicing.model.Customer;
import invoicing.model.Item;

public class Database {
	
	public Customer[] createCustomer()
	{
		Customer[] customers = new Customer[3];
		customers[0] = new Customer(1, "Shalni", "India", "shalini@gmail.com","2323123", "shalini", "GST-123", "Mumnbai");
		customers[1] = new Customer(2, "abc", "India", "abc@gmail.com","442323123", "abc", "GST-23123", "Pune");
		customers[2] = new Customer(3, "xyz", "India", "xyz@gmail.com","782323123", "xyz", "GST-67123", "Delhi");
		return customers;
	}
 
	public Item[] createItems()
	{
		Item items[] = new Item[3];
		items[0]=new Item("I001", "Laptop", "Apple", 98000);
		items[1]=new Item("I002", "Mouse", "Microsoft", 12000);
		items[2]=new Item("I003", "Speaker", "Boat", 30000);
		return items;
	}
}
