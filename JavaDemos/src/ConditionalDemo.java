import java.util.Scanner;

public class ConditionalDemo {

	public static void main(String[] args) {
		/**
		 * coin => head or tail
		 * dice => 1 to 6 
		 * deck of cards => 1 to 52
		 * names of states in India => 29
		 * exact equality
		 * 
		 * switch(variable_name){
		 * 	case <value>:
		 * statements to execute
		 * default:
		 * }
		 * 
		 * if you do not use break, it is called as fall through
		 */
		int x=1,y=5 ,z = 2;
		char ch = 'A';
		z *= x++ + ch++/5 * ch/3 +(y*++z);
		//z = 2 * (1 + 65/5 * 66/3 + (5 * 3) )
		// z = 2(1+13*22+15) = 
		System.out.println(x+" "+y+" "+z+" "+ch);// 2 5 604 B
		
		
		Scanner sc = new Scanner(System.in);
		int dice= sc.nextInt();
		switch(dice) {
		case  1:
			System.out.println("Move 1 step");
			break;
		case 2:
			System.out.println("Move 2 step");
			break;
		case 3:
			System.out.println("Move 3 step");
			break;
		case 4:
			System.out.println("Move 4 step");
			break;
		case 5:
			System.out.println("Move 5 step");
			break;
		case 6:
			System.out.println("Move 6 step");
			break;
		default :
			System.out.println("roll again");
		}


	}

}
