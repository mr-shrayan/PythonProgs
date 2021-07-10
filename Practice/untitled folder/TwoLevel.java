class Level0{
    public void See_a()
    {
        System.out.println("Hello from Level 0");
    }
}
class Level1 extends Level0{
    public void See_b(){
        System.out.println("Hello from Level 1");
    }
}
class Level2 extends Level1{
    public void See_c(){
        See_a();
        See_b();
        System.out.println("Hello from Level 2");
    }
}
public class TwoLevel {
    public static void main(String args[])
    {
        Level2 lv = new Level2();
        lv.See_c();
    }
    
}
