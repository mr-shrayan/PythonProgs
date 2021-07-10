/*Write a program to to check given string is palindrome or not.*/

import java.util.Scanner;

public class Lab8_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String initial, reverse = "";

        System.out.println("Enter a string");
        initial = sc.nextLine();

        int len = initial.length();

        for (int i = len - 1; i >= 0; i--) {

            reverse += initial.charAt(i);
        }

        if (initial.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

        sc.close();
    }
}
