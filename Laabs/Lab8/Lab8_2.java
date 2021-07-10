/*Show an example of multiple catch block and nested try.*/

class Lab8_2 {
    public static void main(String[] args) {

        try {

            try {
                int result = 89 / 0;
                System.out.println("result= " + result);
            }

            catch (ArithmeticException ae) {
                System.out.println("Exception Ocurred");
                System.out.println("Exception Description: " + ae);
            }

            int ar[] = new int[5];
            ar[8] = 32;

            int value = (5 + 6) / 0;
            System.out.println("value= " + value);
        }

        catch (ArrayIndexOutOfBoundsException E) {
            System.out.println("Exception Ocurred");
            System.out.println("Exception Description: " + E);
        }

        catch (ArithmeticException ae) {
            System.out.println("Exception Ocurred");
            System.out.println("Exception Description: " + ae);
        }

    }
}