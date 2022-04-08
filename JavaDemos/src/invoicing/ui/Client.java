package invoicing.ui;

import invoicing.datastore.Database;
import invoicing.model.Customer;
import invoicing.model.Item;

public class Client {

	public static void main(String[] args) {
		Database database = new Database();
		
		Customer customers[] = database.createCustomer();
		Item items[] = database.createItems();

	}

}
