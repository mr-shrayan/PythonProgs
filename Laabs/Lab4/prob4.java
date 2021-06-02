import java.util.*;
class prob4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        sc.nextLine();
        max m=new max(a);
        while(true)
        {
            System.out.println("Wish to continue? y/n");
            char ch=(sc.nextLine()).charAt(0);
            if(ch=='y')
            {
                System.out.println("Enter number");
                int n=sc.nextInt();
                sc.nextLine();
                m.getNum(n);
            }
            else
            {
                m.result();
                break;
            }
        }
    }
}
class max
{
    static int maximum;
    max(int a)
    {
        maximum=a;
    }
    void getNum(int a)
    {
        if(maximum<a)
            maximum=a;
    }
    void result()
    {
        System.out.println(maximum);
    }
}