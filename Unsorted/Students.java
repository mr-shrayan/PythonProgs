import java.io.*;
import java.lang.*;
class Students extends Date
{
     int id;
     String name;
     Date d1;
     int marks[] = new int[3];
     Students(int id, String name, Date d, int s1, int s2, int s3)
     {
          this.id = id;
          this.name = name;
          marks[0] = s1;
          marks[1] = s2;
          marks[2] = s3;
          d1 = new Date(d.day, d.month, d.year);
     }
     public void display()
     {
          System.out.println("\n\nID   Name\tDOB\t  Marks of 3 Subjects");
          System.out.println("===  =====\t=======\t  ===================");
          System.out.println(+id+"  "+name+" \t"+d1.day+"/"+d1.month+"/"+d1.year+"    "+marks[0]+"  "+marks[1]+" "+marks[2]);
          System.out.println("===  =====\t=======\t  ===================");
     }
     public static void main(String ar[])
     {
          Date d = new Date(Integer.parseInt(ar[2]),Integer.parseInt(ar[3]),Integer.parseInt(ar[4]));
          Students  s1 = new Students(Integer.parseInt(ar[0]),ar[1],d,Integer.parseInt(ar[5]),Integer.parseInt(ar[6]),Integer.parseInt(ar[7]));
          s1.display();
     }
}