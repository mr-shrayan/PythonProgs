import java.lang.*;
public class prob5
{
    double real, img;
    prob5(double r, double i)
    {
     this.real = r;
     this.img = i;
    }
    public static prob5 sum(prob5 c1, prob5 c2)
    {
         prob5 temp = new prob5(0, 0);
 
         temp.real = c1.real + c2.real;
         temp.img = c1.img + c2.img;
         return temp;
    }
     public static void main(String args[]) 
     {
        prob5 c1 = new prob5(5.5, 4);
        prob5 c2 = new prob5(1.2, 3.5);
        prob5 temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i\n");
     }
}