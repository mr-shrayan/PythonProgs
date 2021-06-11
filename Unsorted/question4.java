public class question4 {

    public static void main(String[] args) {
        employee ep1 = new employee("Shrayan", 2000);
        employee ep2 = new employee("John", 2001);
        System.out.println("Frist Employee detail");
        ep1.details();
        System.out.println("Second Employee detail");
        ep2.details();
        System.out.println();
        if (ep1.getSalary() > ep2.getSalary()) {
            System.out.println(ep1.getName() + " salary is higher than " + ep2.getName());
        } else {
            System.out.println(ep2.getName() + " salary is higher than " + ep1.getName());
        }
    }

}

class employee {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    void details() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

}