//Write a program to search an element in an array.
import java.util.Scanner;
class lab2_2
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
 int i,n,search,flag=0;
 System.out.println("Enter the number of elements:") ;
 n = sc.nextInt();
 int[] a = new int[n];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     {
         a[i] = sc.nextInt();
     }
 
 System.out.println("Enter the element to be searched");
 search = sc.nextInt();
    
     /search operation/
     for(i=0;i<n;i++)
     {
         if(a[i]==search)
         {
             System.out.println("Element "+search+" found at position "+i+"");
             flag=1;
             break;
         }
     }
     if(flag==0)
     {
         System.out.println("Element "+search+" not found");
     }
 }
}