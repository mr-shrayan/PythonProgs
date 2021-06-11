//Write a program to add two numbers, where numbers is to be accepted using Command line argument
class lab1
{
      public static void main(String ar[])
      {
            int x,y,s;
 
            x=Integer.parseInt(ar[0]);
            y=Integer.parseInt(ar[1]);
 
            s=x+y;
            System.out.println("sum of " + x + " and " + y +" is " +s);
      }
}

