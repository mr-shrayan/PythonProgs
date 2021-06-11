//write a program to find largest and smallest number in an array.
import java.util.Scanner;
class lab1_2
{
public static void main (String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number of elements in an array: ");
int min,max;
int n=scan.nextInt();
int arr[]=new int[n];

for(int i=0; i<n; i++){
   System.out.print("Enter the element "+(i+1)+": ");
   arr[i]=scan.nextInt();
   }
   min=arr[0];
   max=arr[0];
   for(int i=0; i<n; i++){
     if(min>arr[i])
     {
       min=arr[i];
     }
     
     if(max<arr[i]){
       max=arr[i];
     }
   }
   System.out.print("\nThe smallest value is: "+min);
   System.out.print("\nThe largest value is: "+max);
}
}