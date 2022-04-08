
public class LoopDemo {

	public static void main(String[] args) {
		int no = 24;
		int j=2;
		while(no!=1)
		{
			if(no%j==0)
			{
				System.out.println(j);
				no/=j;
			}
			else
				j++;
		}
		
	}

}
