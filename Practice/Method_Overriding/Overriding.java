import java.util.Scanner;
class Cube{
    // int a;
    int calculate(int a){
        // this.a = a;
        return a*a*a;
    }
}
class Square extends Cube{
    // int a;
    int calculate(int a){
        // this.a = a*a;
        return a*a;
    }
}
class Overriding {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Cube c = new Cube();
    Square s = new Square();
    System.out.println("Enter a number to calculate Square and Cube:\n");
    int a = sc.nextInt();
    System.out.println("The cube is: "+c.calculate(a));
    System.out.println("The square is: "+s.calculate(a));
}
}
