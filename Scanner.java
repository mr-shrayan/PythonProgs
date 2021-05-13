//Write a program to add two numbers, where numbers is to be accepted using Scanner class
import java.util.Scanner;
import java.io.*;
class Scanner 
{
    public static void main(String[] args) 
    {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}
