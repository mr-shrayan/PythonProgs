//Write a program to add two numbers, where numbers is to be accepted using
//i) Command Line Argument
public class add
{
    public static void main(String args[])
    {
        int a,b,c;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = a + b;
            System.out.println("sum=" + c);
        }
        catch (Exception e)
        {
            System.out.println("Eror occurs!!");
        }
    }
}