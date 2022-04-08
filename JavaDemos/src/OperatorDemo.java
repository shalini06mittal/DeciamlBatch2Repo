
public class OperatorDemo {

	public static void main(String[] args) {
		
		int m =10;
		/*
		 * int n = m;
		 * m+=1
		 */
		//int n= m++;
		/* m+=1
		 * int n = m;
		 * 
		 */
		int n= ++m;
		System.out.println(n+" "+m);//10 
		/**
		 * 2 = 010
		 * 3 = 011
		 * & = 010
		 * | = 011
		 * ^ = 001
		 */
		System.out.println(2&3);
		System.out.println(2|3);
		System.out.println(2^3);
		/*
		 * ternary operator is used for conditional programming
		 * (expn => boolean) ? true: false
		 */
		int n1 = 10, n2=20;
		int  max = n1 > n2 ? n1 : (n2 > n1) ? n2 : 0;
		/**
		 * WAP to take sp and cp of an item and print profit or loss percentage
		 */
		

	}

}
