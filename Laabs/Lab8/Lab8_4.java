/*Show different types of exceptions.*/

public class Lab8_4 {
    public static void main(String[] args) {

        try {

            int a = 10 / 0;
        }

        catch (ArithmeticException e) {

            System.out.println("ArithmeticException occurs");

        }

        try {
            int a[] = new int[5];
            a[6] = 5;

        } catch (ArrayIndexOutOfBoundsException e1) {

            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }

        try {

            String s = null;
            System.out.println(s.length());

        }

        catch (NullPointerException e) {

            System.out.println("NullPointerException occurs");

        }

        try {
            String str = "hello";
            int num = Integer.parseInt(str);

        }

        catch (NumberFormatException e) {

            System.out.println("NumberFormatException occurs");

        }

    }
}
