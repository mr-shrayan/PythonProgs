// area of rectangle using constructor in java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class RectangleShape 
{
   int area, length, breadth;
   // Parameterized constructor
   RectangleShape(int l, int b) 
   { 
      length = l; 
      breadth = b; 
   } 
   void getArea() 
   { 
      area = length * breadth; 
      System.out.println("Area of rectangle : " + area); 
   } 
}
public class prob2 
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
      int length, breadth; 
      System.out.println("Please enter length : ");
      String strLength = br.readLine(); 
      length = Integer.parseInt(strLength);
      System.out.println("Please enter breadth : ");
      String strBreadth = br.readLine(); 
      breadth = Integer.parseInt(strBreadth); 
      RectangleShape rs = new RectangleShape(length, breadth); 
      rs.getArea();
   }
}