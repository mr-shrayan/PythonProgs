import javax.print.attribute.standard.PrinterLocation;

class one{
    void check()
    {
        System.out.println("Hello from one");
    }
}
class two extends one{
    void check()
    {
        super.check();
        System.out.println("Hello from two");
    }
}
class superkey {
    public static void main(String[] args) {
        two obj = new two();

        obj.check();
    }
    
}
