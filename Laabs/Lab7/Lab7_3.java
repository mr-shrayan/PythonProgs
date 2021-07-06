/*Show a program where an abstract class inheriting from another
abstract class.*/

abstract class A {
    abstract void show();
}

class A1 extends A {
    void show() {
        System.out.println("This method is inheritted from A");
    }
}

abstract class B extends A {
    abstract void display();
}

class B1 extends B {
    void display() {
        System.out.println("This method is inheritted from B");
    }

    void show() {
        System.out.println("This method is inheritted from A");
    }
}

public class Lab7_3 {
    public static void main(String[] args) {
        A1 ob1 = new A1();
        B1 ob2 = new B1();

        ob1.show();
        ob2.display();
        ob2.show();
    }

}
