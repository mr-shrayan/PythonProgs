//Write a program to add two numbers, where numbers is to be accepted using Command line argument
class lab1 
{
    public static void main(String[] args) 
    {
        int a, b, sum;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        sum = a + b;
        System.out.println("Sum is " + sum);
    }
}

