/*
 * Write a program to show an example of multiple inheritance which extends and
 * implements at the same time.
 */
interface A {
    void methodA();
}

interface B {
    void methodB();
}

abstract class C {
    abstract void methodC();
}

class abc extends C implements A, B {
    public void methodA() {
        System.out.println("This is from interface A");
    }

    public void methodB() {
        System.out.println("This is from interface B");
    }

    public void methodC() {
        System.out.println("This is from abstract class C");
    }
}

public class Lab7_5 {
    public static void main(String[] args) {

        abc obj = new abc();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}