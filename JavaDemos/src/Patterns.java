import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			int n=sc.nextInt();
			if(n>9)
			{
				int sum=0,rem;
				   
				   
				   while(n>0)
				   {
				       rem=n%10;
				       sum=sum+rem;
				       n=n/10;
				   }
				   // Sum of digits of 712 is : 10
				   System.out.println("Sum of "+n+ " th number is:"+sum);
			}
			else
			{
				i=i-1;
			}
		}
		
		
	}

}























