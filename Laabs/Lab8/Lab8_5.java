/*Write a program to compare two strings using ==, compareTo() and
equals() method.*/

public class Lab8_5 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "HeLLo";

        if (s1 == s2)
            System.out.println("Both are same");
        else
            System.out.println("Not same");

        int c = s1.compareTo(s2);
        if (c > 0)
            System.out.println("s1 is greater");
        if (c < 0)
            System.out.println("s2 is greater");
        if (c == 0)
            System.out.println("s1 and s2 are equal");

        if (s1.equals(s2))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
