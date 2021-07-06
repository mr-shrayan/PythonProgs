/*Find the square, square root and cube of number. Use abstract class
to design your program.*/

abstract class Calculation {
    abstract void Cal(int n);
}

class Square extends Calculation {
    void Cal(int n) {
        System.out.println("Square of the given number is " + (n * n));
    }
}

class SquareRoot extends Calculation {
    void Cal(int n) {
        System.out.println("Square root of the given number is " + Math.sqrt(n));
    }
}

class Cube extends Calculation {
    void Cal(int n) {
        System.out.println("Cube of the given number is " + (n * n * n));
    }
}

public class Lab7_1 {
    public static void main(String[] args) {
        Square ob1 = new Square();
        SquareRoot ob2 = new SquareRoot();
        Cube ob3 = new Cube();

        ob1.Cal(4);
        ob2.Cal(25);
        ob3.Cal(3);
    }
}
