class Human{
    public void eat()
    {
       System.out.println("Human is eating");
    }
 }
 class prog1 extends Human{
    public void eat(){
       System.out.println("Boy is eating");
    }
    public static void main( String args[]) {
       prog1 obj = new prog1();
       obj.eat();
    }
 }