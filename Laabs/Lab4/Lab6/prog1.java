import java.util.*;
class Teacher 
{

    String name;
    int id;

    void SetName(String name) {
        this.name = name;
    }

    String ShowName() {
        return name;
    }

    void SetId(int id) {
        this.id = id;
    }

    int ShowId() {
        return id;
    }
}

class Student extends Teacher {

    int marks;

    void SetMarks(int marks) {
        this.marks = marks;
    }

    int ShowMarks() {
        return marks;
    }
}

class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Teacher obj1 = new Teacher();
        System.out.println("Enter name of Teacher");
        obj1.name = sc.nextLine();
        System.out.println("Enter id of Teacher");
        obj1.id = sc.nextInt();
        sc.nextLine();

        Student obj2 = new Student();
        System.out.println("Enter name of Student");
        obj2.name = sc.nextLine();
        System.out.println("Enter id of Student");
        obj2.id = sc.nextInt();
        System.out.println("Enter marks of Student");
        obj2.marks = sc.nextInt();

        System.out.println("Name of Teacher is " + obj1.ShowName());
        System.out.println("Id of Teacher is " + obj1.ShowId());

        System.out.println("Name of Student is " + obj2.ShowName());
        System.out.println("Id of Student is " + obj2.ShowId());
        System.out.println("Marks of Student is " + obj2.ShowMarks());

        sc.close();
    }
}