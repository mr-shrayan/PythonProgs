//"this" passed as method parameter
class Test_method
{
    int val1;
    int val2;
 
    Test_method()
    {
        val1 = 10;
        val2 = 20;
    }
 
    void printVal(Test_method obj)
    {
             System.out.println("value 1 = " + obj.val1 + "\nvalue 2 = " + obj.val2);
    }
 
    void get()
    {
           printVal(this);
    }
}
 
class Prog3_2{
    public static void main(String[] args)
    {
        Test_method object = new Test_method();
        object.get();
    }
}