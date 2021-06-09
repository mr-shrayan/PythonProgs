//Passing this as an argument to the constructor
class Static_A
{
     Static_B obj;
 
     Static_A(Static_B obj)
    {
        this.obj = obj;
        obj.display();
    }
 }
 
class Static_B
{
    int x = 10;
    Static_B()
    {
          Static_A obj = new Static_A(this);
    }
 
    void display()
    {
          System.out.println("\nB :: x = " + x);
          System.out.println("\n");
    }
}
 
class Prog3_5{
     public static void main(String[] args) {
        Static_B obj = new Static_B();
    }
}