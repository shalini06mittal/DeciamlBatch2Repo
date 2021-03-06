package invoicing.ui;

import java.time.LocalDateTime;
import java.util.Scanner;

import invoicing.datastore.Database;
import invoicing.model.Customer;
import invoicing.model.Item;
import invoicing.model.LineItem;
import invoicing.model.Order;

public class Client {

	public static void main(String[] args) {
		Database database = new Database();
		
		// shalini06mittal@gmail.com
		Customer customers[] = database.createCustomer();
		Item items[] = database.createItems();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email id");
		String email = sc.next();
		// to verify customer email exists => To-Do
		
		System.out.println("How many items do you want to purchase");
		int count = sc.nextInt();//3
		LineItem lineitems[] = new LineItem[count];
		Order order = new Order();
		order.setOrderid("0001");
		int i=0;
		do {
			System.out.println("Choose an Item to purchase");
			System.out.println("Id\tName\tManufacturer\tPrice");
			System.out.println("-----------------------------------------------------------");
			for(Item item : items)
			{
				System.out.print(item.getItemid()+"\t"+item.getItemname()
				+"\t"+item.getManufacturer()+"\t\t"+item.getPrice());
				System.out.println();
			}
			String itemid = sc.next();
			System.out.println("Enter Quantity");
			int qty = sc.nextInt();
			Item item = null;
			for(Item obj : items)
			{
				if(obj.getItemid().equals(itemid))
				{
					item = obj;
					break;
				}
			}
			LineItem lineitem = new LineItem(item, order, item.getPrice(), qty);
			lineitems[i++] = lineitem;
			count--;
		}while(count!=0);

		order.setLineitems(lineitems);
		order.setOrderdate(LocalDateTime.now());
		System.out.println(order);
		System.out.println(order.getLineitems());
	}

}
