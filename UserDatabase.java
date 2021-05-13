//Prog5
import java.util.Scanner;
class User {
    private String name;
    private int age;

    void input (String name, int age)
    {
        this.name = name ;
        this.age = age;
    }
    
    String getName()
    {return name;}
    int getAge()
    {return age;}
}

class Logic{
    private User firstUser;
    private User secondUser;
    Logic(User firatUser, User secondUser)
    {
        this.firstUser = firstUser;
        this.secondUser = secondUser;
    }

    void compareAge(){
        if(firstUser.getAge() > secondUser.getAge())
        System.out.println(String.format("The age of %s is greater than that of %s", firstUser.getName(),secondUser.getName()));
        else
        System.out.println(String.format("The age of %s is greater than that of %s", secondUser.getName(), firstUser.getName()));
    }
}

public class UserDatabase{
    public static void main(String[] args){
        User firstUser = new User();
        User secondUser = new User();

        String name ;
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter teh anme of the First User: ");
        name = scanner.next();
        System.out.print("Enter teh age of the first user : ");
        age = scanner.nextInt();

        firstUser.input(name,age) ;

        System.out.print("Enter the name of the second user : ");
        name = scanner.next();
        System.out.print("Enter teh age of the second user : ");

        age = scanner.nextInt ();

        secondUser.input(name, age);

        Logic logic  = new Logic (firstUser, secondUser);

        logic.compareAge();
    }
}