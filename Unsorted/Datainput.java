//Write a program to add two numbers, where numbers is to be accepted using Data Input Stream
import java.util.*;
import java.io.DataInputStream;
class Datainput
{
public static void main(String args[])
{
DataInputStream in = new DataInputStream(System.in);
int a=0;
int b=0;
try
{
System.out.print("enter the value of integer  number a=");
a=Integer.parseInt(in.readLine());
System.out.print("enter the value of integer  number b=");
b=Integer.parseInt(in.readLine());
}
catch (Exception e) { }
int sum;
sum=a+b;
System.out.println("sum of a and b variable is="+sum);
}
}
