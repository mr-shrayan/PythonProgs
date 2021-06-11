//Reverse of a diagonal
import java.util.Scanner;

public class RevDiagonal 
{
	private static Scanner sc;
	
	public static void main(String[] args) 
    {
		int i, j, rows, columns, temp;
		
		sc= new Scanner(System.in);
		
		System.out.println("\n Enter the rows and columns  ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][] arr = new int[rows][columns];
		
		System.out.println("\n Enter the Matrix items  ");
		for(i = 0; i < rows; i++) 
        {
			for(j = 0; j < columns; j++) 
            {
				arr[i][j] = sc.nextInt();
			}		
		}
		
		if(rows == columns) // matrix match check
        {
			for(i = 0; i < rows ; i++)
			{
				temp = arr[i][i];
				arr[i][i] = arr[i][rows-i-1];
				arr[i][rows-i-1] = temp;
			}
			System.out.println("\n Matrix Items after Reversing are");
			for(i = 0; i < rows ; i++)
			{
				for(j = 0; j < columns; j++)
				{
					System.out.format("%d \t", arr[i][j]);
				}
				System.out.print("\n");
			}
		}// matric match end
		else 
		{
			System.out.println("\n ERROR: Please Enter a Square Matrix");
		}//else end
	}//main end
}








