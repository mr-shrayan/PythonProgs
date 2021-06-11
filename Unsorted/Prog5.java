//Write a program to accept a string, character and float variable and print them.
import java.util.Scanner;
class Prog4
{
   public static void main(String args[])
   {
      int a;
      float b;
      String s;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string:");
      s = input.nextLine();     
      
      System.out.println("Enter an integer:");
      a = input.nextInt();      
      
      System.out.println("Enter a float:");
      b = input.nextFloat();    

      System.out.println("String = "+s);
      System.out.println("Integer = "+a); 
      System.out.println("Float =  "+b);
     }
}
