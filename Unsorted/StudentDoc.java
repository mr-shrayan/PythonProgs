//q3
public class StudentDoc {

    public static void main(String[] args) {
        Student s1 = new Student("Shrayan", 20, 27);
        Student s2 = new Student("Ankit", 20, 28);
        Student s3 = new Student("Arnab", 20, 29);
        System.out.println("Student 1 detail");
        s1.details();
        System.out.println("Student 2 detail");
        s2.details();
        System.out.println("Student 3 detail");
        s3.details();

    }
}

//student database
class Student {
    private String name;
    private final String branch = "CSE";
    private int age;
    private int roll_no;

    public Student(String name, int age, int rool_no) {
        this.name = name;
        this.age = age;
        this.roll_no = rool_no;
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

    /**
     * @return int return the roll_no
     */
    public int getRoll_no() {
        return roll_no;
    }

    /**
     * @param roll_no the roll_no to set
     */
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Age: " + age);
        System.out.println("Roll no: " + roll_no);
    }

}