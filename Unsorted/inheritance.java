final class A{
    int i;
}
class B extends A 
{
    int j;
    System.out.pritnln(j+ " " +i);

}
class inheritance
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.display();
    }
}