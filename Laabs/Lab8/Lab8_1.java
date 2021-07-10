// Program to show use of try catch and finally block

import java.util.Scanner;

class Lab8_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try 
        { // n = 0 throws the exception
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int z = 100 / n;
            System.out.println("Answer = " + z);
        }

        catch (Exception e) 
        {
            System.out.println("Exception : " + e);
            System.out.println("Zero is not accepted. Please Try again.");
        }

        finally {
            System.out.println("Program closed");
        }
    }
}