import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		/*
		 * Take 5 nos as input from the user. Every no  entered should be a n-digit number where 
		6>= n > 1. If it is a single digit number ask the user to enter again till he enters the range.
		Once the user enters the number find the sum of digits and print the output as follows:

		ex:  3982
		Sum of digits of 3982 = 22
		
		298
		Sum of digits of 298 = 19
		
		duck number => should  contain  zero, but cannot start with zero 
		 */
		Scanner sc = new Scanner(System.in);
		int no = 0;
		for(int i=1;i<=5;i++)
		{
			do {
				System.out.println(i+". Enter a n-digit number greater than 1 and less than 7");
				no = sc.nextInt();
			}while(no < 10 || no > 100000);
			System.out.println("you entered no "+no);
			int t = no;
			int sum = 0;
			while(t!=0) {
				sum += t%10;
				t/=10;
			}
			System.out.println("The sum of digits of "+no+" : "+sum);
		}
	}

}
