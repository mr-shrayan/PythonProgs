// example of multiple catch block and nested try

class Lab8_2 {
    public static void main(String[] args) {
        try {
            try {
                int n = 100 / 0; // throws exception
                System.out.println("result= " + n);
            }

            catch (ArithmeticException ae) {
                System.out.println("Exception : " + ae);
            }

            int arr[] = new int[10];
            arr[6] = 30;

            int value = (5 + 6) / 0; // throws exception
            System.out.println("value = " + value);
        }

        catch (ArrayIndexOutOfBoundsException E) {
            System.out.println("Exception : " + E);
        }

        catch (ArithmeticException ae) {
            System.out.println("Exception : " + ae);
        }

    }
}