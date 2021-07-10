//Program to show different types of exceptions.

public class Lab8_4 {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;//throws exceptions cannot divide by 0. 
            //Anything divided by zero is infinity, And is not accepted by a computer.
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurs");
        }


        try {
            int a[] = new int[5];
            a[6] = 5; // trying to search an array position that does not exist. 
        }
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }


        try {
            String s = null;
            System.out.println(s.length()); // s = null so it has no length. the object has null value
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException occurs");
        }


        try {
            String str = "hello";
            int num = Integer.parseInt(str); // trying to convert a string into a numeric value. 
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurs");
        }

    }
}
