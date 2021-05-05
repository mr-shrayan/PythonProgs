
//Diagonal Of a matrix
import java.util.*;
import java.util.Scanner;
class Diagonal
{  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
 
            int i,j,row,column,s=0;
            System.out.println("Enter the number of rows:");
            row = sc.nextInt();
            System.out.println("Enter the number of columnumns:");
            column = sc.nextInt();
 
            int[][] mat = new int[row][column];
 
        System.out.println("Enter the elements of the matrix") ;
        for(i=0;i<row;i++)
        { 
            for(j=0;j<column;j++)
            {  
                mat[i][j] = sc.nextInt();
            }
        } 
 
        System.out.println("The elements of the matrix") ;
        for(i=0;i<row;i++)
        { 
            for(j=0;j<column;j++)
            { 
                System.out.print(mat[i][j]+"\t");
            }
                System.out.println("");
        }

        for(i=0;i<row;i++)
        { 
            for(j=0;j<column;j++)
            { 
                if(i==j) //this condition checks for diagonal
                {
                    s = s + mat[i][j]; // sum
                }
            }
        }

        System.out.printf("DIAGONAL elements of the matrix = "+s) ;
        System.out.println("\n");
    }//main end 
}