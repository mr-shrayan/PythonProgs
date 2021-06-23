import java.util.Scanner;

class Commercial 
{
    String name;

    void setname(String s) {
        name = s;
    }

    void getname() {
        System.out.println(name);
    }

    void calculatebill(int unit) {
        int cost = 5 * unit;
        System.out.println("Bill amount" + cost);
    }
}

class Domestic extends Commercial

    {
        void calculatebill(int unit) {
            double cost = 2.5 * unit;
            System.out.println("Bill amount" + cost);
        }
    }


class prog5 
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        Commercial obj1 = new Commercial();
        Domestic obj2 = new Domestic();

        obj1.setname("Mr. Ajay");
        obj1.getname();
        System.out.println("Enter no. of units used");
        int n = sc.nextInt();
        obj1.calculatebill(n);

        obj2.setname("Mr. Ray");
        obj2.getname();
        System.out.println("Enter no. of units used");
        int m = sc.nextInt();
        obj2.calculatebill(m);
    }
}