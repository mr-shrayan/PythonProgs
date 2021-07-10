/*Write a program to calculate percentage of a student for 3 different
subjects. Create an exception if the marks entered greater than 100.*/

import java.util.Scanner;

public class Lab8_3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int marks[] = new int[3];

        try {
            System.out.println("Enter the marks");
            for (int i = 0; i < 3; i++) {
                marks[i] = sc.nextInt();

                if (marks[i] > 100) {
                    throw new Exception();
                }

                else
                    sum = sum + marks[i];
            }
            System.out.println("Percentange = " + (sum / 3.0));
        }

        catch (Exception e) {
            System.out.println("Exception: Entered marks is greater than 100");
        }
    }
}
