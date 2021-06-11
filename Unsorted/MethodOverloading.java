/*Write a program to add two integers, three integers and two floating
point numbers using method overloading.*/
class Adder
{  
    static int add(int a, int b)
    {return a+b;}  
    static int add(int a, int b, int c)
    {return a+b+c;}
    static double add(double a, double b)
    {return a+b;}  
}  
class MethodOverloading
{  
    public static void main(String[] args)
    {  
    System.out.println(Adder.add(1,10));  
    System.out.println(Adder.add(10,20,30));
    System.out.println(Adder.add(12.3,12.6));  
    }
} 