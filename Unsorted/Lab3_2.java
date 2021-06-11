// Find the area of a square, rectangle and triangle using method overloading.
// import java.util.*;
// import java.io.*;
import java.util.Scanner;
class Lab3_2 {
    public static void main(String args[])
    {
        int Area(int sq){return(sq*sq);}

        int Area(int l, int br){return(l*br);}

        double Area(int a, int b, int c)
        {double s = (a+b+c)/2;
            double ar= Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return (ar);}

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of a side of square");
        int sq = sc.nextInt();

        System.out.println("Enter length and breadth of rectangle");
        int l = sc.nextInt(); 
        int br = sc.nextInt();

        System.out.println("Enter length of three sides of triangle");
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Area of square is " + Area(sq));
        System.out.println("Area of rectangle is " + Area(l,br));
        System.out.println("Area of triangle is " + Area(a,b,c));

    }
}