import java.util.Scanner;

public class NestedLoopDemo {

	public static void printTable(int no)
	{
		for(int i=1;i<=10;i++) // inner loop => columns, will restart for every new value of outer loop
			System.out.print(no*i +" ");
	}
	public static void main(String[] args) throws InterruptedException {
		/*
		 * for financial year 2015 to 2020, 
		 * ask the user to enter how many bills for every year
		 * and for every bill take the amount and print the
		 * total of amount for that year
		 */
		
		// if(3>2>1>)
		Thread.sleep(10000);
		int x=3, y=2, z=1;
		if(x>y && y>z) {
			
		}
		// is 25 divisible by 3 and 5 ? false
		// is 25 divisible by 3 or 5 ? true
		x = 25;
		if(x%3==0 && x%5==0) // login screen uname and password
			System.out.println(x+ " is divisible by 3 and 5");
		if(x%3==0 || x%5==0) // sign in options google or linkedin
			System.out.println(x+ " is divisible by 3 or 5");
	}
	

}
