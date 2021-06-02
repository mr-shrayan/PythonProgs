import java.util.*;
class student
{
    private String name;
    private int marks;

    student(String n,int x)
    {
        this.name=n;
        this.marks=x;
    }

    String getname()
    {
        return name;
    }
    int getmarks()
    {
        return marks;
    }
}
class prob1
{
        public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of student 1 and student 2");
        String n1=sc.nextLine();
        String n2=sc.nextLine();
        System.out.println("Enter the marks of student 1 and student 2");
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        student a=new student(n1,marks1);
        student b=new student(n2,marks2);
        System.out.println("Name of Student A is "+a.getname());
        System.out.println("Marks of Student A is "+a.getmarks());
        System.out.println("Name of Student B is "+b.getname());
        System.out.println("Marks of Student B is "+b.getmarks());

        if(a.getmarks()>b.getmarks())
        {
            System.out.println( a.getname()+" Got  more marks ");
        }
        else
        {
            System.out.println( b.getname()+" Got  more marks ");
        }
    }
}