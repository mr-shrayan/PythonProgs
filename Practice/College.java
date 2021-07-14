/* An educational institution wishes to maintain a database of its employees. The
database is divided into a number of classes whose hierarchical relationships are
shown in the figure below. The figure also shows the minimum information required
for each class. Specify all the classes and define methods to create the database and
retrieve individual information as and when required. Implement this application by
creating multiple classes. Also, write a driver class (called College) and illustrate the
execution of this application. Use simple print statements in the methods. */

/*
Name : SHRAYAN BANDYOPADHYAY
Roll: L20/CSE/228
UNI. ROLL: 10300120210
 */

//Driver Class.
class College {
    public static void main(String[] args) {

        System.out.println("\n\nProgrammer Name : Shrayan Bandyopadhyay");
        System.out.println("Programmer College Roll number: L20/CSE/228");
        System.out.println("------------------OUTPUT--------------------\n\n");

        System.out.println("Details of Teacher");
        Teacher t = new Teacher(493, "Sir. Palash Ray", "OOP", "Java");
        t.Show();
        Teacher s = new Teacher(493, "Swarnali Paul", "OOP", "Java Lab");
        s.Show();
        System.out.println("\n...................................");
        System.out.println("\n\nDetails of Typist\n");
        Regular r = new Regular(401, "Sir. Biplab Sinha Mahapatra", 98 , 50000); // regular
        r.Show();
        Casual c = new Casual(494, "Sir. Arindam Giri", 80, 750); //casual
        c.Show();
        System.out.println("\n...................................");
        System.out.println("\n\nDetails of Officer\n");
        Officer f = new Officer(330, "Dr. Subhankar Joardar", "A+\n"); //officer
        f.Show();

    }
}

class Staff {

    int code;
    String name;

    public Staff(int code, String name) {

        this.code = code;
        this.name = name;
    }

    public void Show() {

        System.out.println("\nName: " + name);
        System.out.println("\nCode : "+ code);

    }
}

class Teacher extends Staff {
    String subject;
    String publication;

    public Teacher(int code, String name, String subject, String publication) {

        super(code, name);

        this.subject = subject;
        this.publication = publication;

    }

    public void Show() {

        super.Show();
        System.out.println("Subject: " + subject);
        System.out.println("Publication : " + publication);
    }

}

class Typist extends Staff {
    int speed;

    public Typist(int code, String name, int speed) {

        super(code, name);
        this.speed = speed;
    }

    public void Show() {

        super.Show();
        System.out.println("Speed: " + speed);
    }

}

class Casual extends Typist {
    int DailyWage;

    public Casual(int code, String name, int speed, int DailyWage) {
        super(code, name, speed);
        this.DailyWage = DailyWage;
    }

    public void Show() {

        super.Show();

        System.out.println("Daily Wages: " + DailyWage);
    }
}

class Regular extends Typist {
    int salaryMonthly;

    public Regular(int code, String name, int speed, int salaryMonthly) {
        super(code, name, speed);
        this.salaryMonthly = salaryMonthly;
    }

    public void Show() {

        super.Show();
        System.out.println("Monthly Salary: " + salaryMonthly);
    }
}

class Officer extends Staff {
    String grade;

    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public void Show() {

        super.Show();
        System.out.println("Grade: " + grade);
    }
}