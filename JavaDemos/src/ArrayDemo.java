import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		// declare an array if type int
		// created an array of size 5 using new
		int nos[] = new int[5];
		// intialize the array with values
		Scanner sc = new Scanner(System.in);
		//		for(int i=0;i<nos.length;i++)
		//		{
		//			System.out.println("Enter value "+(i+1));
		//			nos[i] = sc.nextInt();// i=0, 1
		//		}
		//		for(int i=0;i<nos.length;i++)
		//		{
		//			System.out.println(nos[i]);
		//		}
		/*
		 *  Take the size as input from the user for array.
		 *  Create array of type double and take the fahrenheit as input from the user
		 *  and convert to celcius and print as follows: 
		 *  Fah		Celcius	
		 *  -------------------	
		 *  32		98
		 */

//		System.out.println("Enter how many values");
//		int total = sc.nextInt();
//
//
//		double fahrenheit[] =new double[total];
//		System.out.print("Enter 5 Fahrenheit values:: ");
//		for(int i=0;i<total;i++)
//		{
//			fahrenheit[i]=sc.nextDouble();
//
//		}
//		System.out.println("Farenheit\tCelcius");
//		for(int i=0;i<total;i++)
//		{
//			double celsius =(( 5 *(fahrenheit[i] - 32.0)) / 9.0);
//			System.out.println(fahrenheit[i]+"\t\t"+celsius);
//		}

		/*
		 * Create a string array to store 5 colors.
		 * Ask the user its favorite color and print if color exists in the colors array
		 */

		String[] arr = new String[] {"black", "red", "pink", "bluegreen", "yellow"};

		
		System.out.printf("Enter your color: ");
		String str = sc.nextLine();

		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i].contains(str));
		}
		
		for(int i=0; i<arr.length; i++){
			if(str.equals(arr[i])){
				System.out.println("It's found");
				break;
			}

			else if(arr[i]==arr[arr.length-1]){
				System.out.println("Not Found");
			}
		}
	}

}
