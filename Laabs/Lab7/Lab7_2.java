/* Implement the below diagram** using abstract class */

abstract class university {
    abstract void u1();

    void u1_1() {
        System.out.println("this is ECE FROM HIT");

    }

    void u1_2() {
        System.out.println("this is BT FROM HIT");
    }

}

class hit extends university {
    void u1() {
        System.out.println("this is CSE from HIT");

    }

}

class mit extends university {
    void u1() {
        System.out.println("this is CSE FROM MIT");
    }

    void eie() {
        System.out.println("this is EIE FROM MIT");

    }

    void ft() {
        System.out.println("this is FT FROM MIT");

    }
}

class kit extends university {
    void u1() {
        System.out.println("this is CSE FROM KIT");
    }

}

public class Lab7_2 {
    public static void main(String[] args) {
        hit cse = new hit();
        hit ece = new hit();
        hit bt = new hit();
        mit cse1 = new mit();
        mit eie = new mit();
        mit ft = new mit();
        kit cse2 = new kit();
        kit ece2 = new kit();
        kit bt2 = new kit();
        cse.u1();
        ece.u1_1();
        bt.u1_2();
        cse1.ft();
        eie.eie();
        ft.ft();
        cse2.u1();
        ece2.u1_1();
        bt2.u1_2();

    }
}