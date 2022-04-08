import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class First {
	// command line arguments
	public static void main(String[] args) throws IOException {
		
		int table = 10, i1=1;
		System.out.printf("%d * %d = %d\n", table,i1,table*i1);//.println();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter char");
//		
//		char ch = sc.next().charAt(0);
//		System.out.println(ch);
//		
//		System.out.println("enter a character");
//		char c1 = (char)System.in.read();
//		
//		System.out.println("c1 "+c1);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("innput string");
		String data = reader.readLine();
		System.out.println("data "+data);
		
		
//		int seconds = sc.nextInt();
//		
//		String name = sc.next();
//		double temp = sc.nextDouble();
//		
//		System.out.println("you entered "+seconds);
		/**
		 * Data types
		 * byte 8 bits
		 * char 2 bytes
		 * short 2 
		 * int  4
		 * long 8
		 * float 4
		 * double  8
		 * boolean => true or false
		 * 
		 * variables
		 * containers that store values
		 * they represent memory locations
		 * the values can vary in the variable
		 * 
		 * variable naming rules :
		 * 1) camelcase
		 * 2) cannot start with number or symbol except _ or $
		 * 3) can start with alphabet or _ or $
		 * 4) variables names are always in small
		 * 5) can contain number, alphabets, _ or $. No other symbol is allowed not even space
		 * 6) variables names cannot be reserved words
		 * 
		 * .c => .obj => 
		 * compiler => checks for syntax errors and compiles a .class file
		 * this .class file contains intermediate code or bytecode. platform independent file
		 * WORA => Write once run anywhere
		 * JVM i.e the java interpreter . Highly platform dependent
		 * bytecode verifier 
		 */
		
		byte b1 = 10;
		char ch1 = '1';
		String name1 = "Shalini";
		short s = 12;
		int i = 10;
		long l1 = 10l;// default for integers is int
		float f1 = 23.32f;// default for decimal values is double
		double d1 = 324234.324;
		boolean choice = true;
		// i = 10
		System.out.println("i = "+i);// 10 i
		System.out.println(i+s);
		System.out.println("Result "+i+s);
		System.out.println(i+s+" Result");
		System.out.println('a'+'b');//ascii 97 98
		System.out.println("Hello"+"World");
		
		/**
		 * Take seconds as input from the user and print the
		 * hours:mins:seconds as output
		 */
	
	}
}






