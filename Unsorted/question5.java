import java.util.Scanner;

public class question5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Frist employee name and age:");
        String name1 = sc.nextLine();
        int age1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Second employee name and age:");
        String name2 = sc.nextLine();
        int age2 = sc.nextInt();
        person p1 = new person(name1, age1);
        person p2 = new person(name2, age2);
        System.out.println(" Person 1 detail");
        p1.details();
        System.out.println(" Person 2 detail");
        p2.details();
        System.out.println();
        if (p1.getAge() > p2.getAge()) {
            System.out.println(p1.getName() + " age is bigger than " + p2.getName());
        } else {
            System.out.println(p2.getName() + " age is bigger than " + p1.getName());
        }
    }

}

class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    void details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}