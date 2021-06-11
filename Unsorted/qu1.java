
import java.io.*;

class Factorial
{  
    int fact(int n)
    {    
     int f=1,i;
     for(i=1; i<=n;i++)
     {
     f=f*i;
     }
     return f;
    }    
}

class qu1
{
    public static void main(String args[])
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int num = sc.nextInt();
        Factorial facto = new Factorial();
        int result = obj.fact(num);
        System.out.println("Factorial is"+result);
    
     }    
}