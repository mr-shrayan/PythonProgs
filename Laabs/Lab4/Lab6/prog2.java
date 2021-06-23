class Car{
    public void Fuel()
    {
       System.out.println("The car needs fuel");
    }
 }
 class prog2 extends Car{
    public void Fuel(){
       System.out.println("The car needs fuel");
    }
    public static void main( String args[]) {
       prog2 obj = new prog2();
       obj.Fuel();
    }
 }