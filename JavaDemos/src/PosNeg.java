import java.util.Scanner;

public class PosNeg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1 != n2 && n2 != n3)
		{
			if(n1 > n2 && n1 > n3)
				System.out.println(n1);
			else if(n2>n3)
				System.out.println(n2);
			else
				System.out.println(n3);
		}
		else
			System.out.println("They all are equal");
		if(n1 > 0 && n2>0 && n3>0)
			System.out.println("All are Positive number");
		else if(n1 < 0 && n2<0 && n3<0)
			System.out.println("ALl are negative");
			else
				System.out.println("Combination of positive and negative12");
				;
	}
}
