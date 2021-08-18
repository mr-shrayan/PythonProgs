interface A
{
public void a();
}
abstract class B implements A
{
public void a();
{}
}
class C extends B
{
public void a()
{
System.out.println("C");
}
}
class Test7 
{
public static void main(String args[])
{
new C().a();
}
}
