/*Write a program to show use of try catch and finally block.*/

import java.util.Scanner;

class Lab8_1 {
    public static void main(String[] args) {

        // double result;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int ab = 48 / n;
            System.out.println("Answer = " + ab);
        }

        catch (Exception e) {
            System.out.println("Exception ocurred\n" + e);
            System.out.println("Enter a value other than zero");
        }

        finally {
            System.out.println("Program closed");
        }

        sc.close();
    }
}