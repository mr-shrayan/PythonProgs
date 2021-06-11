import java.io.DataInputStream;

public class Sidatainput {
    
class SimpleIntrest
{
    public static void main(String args[])
    {
       DataInputStream in = new DataInputStream(System.in);
       float p, n ,r ,si;
       try
       {
            System.out.print("Enter the total principle: ");
            p =Float.parseInt(in.readLine());
            System.out.print("Enter the number of years:  ");
            n =Float.parseInt(in.readLine());
            System.out.print("Enter the interest: ");
            r =Float.parseInt(in.readLine());
            float si = (p * n * r) / 100;                                          
        }
        catch(Exception e) 
        {
        System.out.println("Error")
        }
        System.out.println("Calculated simple interest is : " + si);
        }
}
}
