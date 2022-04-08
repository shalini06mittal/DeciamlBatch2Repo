import java.util.Scanner;

public class JumpStatementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		// continue will skip for that iteration
		// D:/Demos/.jpg
		// file1 to filen
		// if file ends with .jpg c++
		
		for(int i=1;i<=10;i++)
		{
			if(i%3==0) continue;
			System.out.println(i);
		}
		
		Thread.sleep(10000);
		do {
			System.out.println("enter a no or 0 to exit");
			int no = sc.nextInt();
			if(no == 0) {
				System.out.println("Thanks for visiting!!");
				break;
			}
			
				System.out.println(Math.pow(no, 4));
			
		}while(true);

	}
	// Menu Driven program 
	// Watch shoes 
	// put in loop
	/*
	 * Enter your name
	 * Shalini Mittal
	 * Enter an item to purchase or -1 to stop purchasing
	 * 1. Watch 1000
	 * 2. ..
	 * 3. ...
	 * 
	 * 1
	 * enter quantity
	 * 3
	 * // total = 1000*3= 3000
	 *Enter an item to purchase or -1 to stop purchasing
	 * 1. Watch 1000
	 * 2. ..
	 * 3. ...
	 * 
	 * 2
	 * enter quantity
	 * 1
	 * //total = 500*1= 3000 + 500 = 3500
	 * Enter an item to purchase or -1 to stop purchasing
	 * 1. Watch 1000
	 * 2. ..
	 * 3. ...
	 * -1
	 * Thanks for shopping. 
	 * Total : 3500
	 * Please pay and collect your gift : key ring
	 * 
	 */

}
