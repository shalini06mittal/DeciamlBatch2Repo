
public class Array2DDemo {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][2];
		// rows = 3 and cols = 2 , total values = 3*2 = 6
		int arr1[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(arr.length);// no of rows
		// jagged arrays
		System.out.println(arr[0].length);
		
		for(int r=0;r<arr.length;r++)// 3
		{
			for(int c=0;c<arr[0].length;c++)
			{
				arr[r][c] = r+ c + 1;
			}
		}
		for(int r=0;r<arr.length;r++)// 3
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}
}
