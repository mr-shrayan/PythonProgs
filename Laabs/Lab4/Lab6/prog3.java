class A
{
    void show()
    {
        System.out.println("Hello from A");
    }
    int show(int x){
        System.out.println("Overload from A "+x);
        return 0;
    }
}
class B extends A{
    void show()
    {
        System.out.println("Hello from B");
    }
}
class prog3
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.show(10);
        obj.show();
    }
}