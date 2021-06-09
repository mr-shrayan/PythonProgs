// Accessing instance variable using "this" keyword
class this_Test
{
     int val1;
     int val2;
 
    // Parameterized constructor
    this_Test(int val1, int val2)
    {
        this.val1 = val1 + val1;
        this.val2 = val2 + val2;
    }
 
   void display()
    {
          System.out.println("Value 1 = " + val1 + "\nValue 2 = " + val2);
    }
}
 
class Prog3_1{
 
       public static void main(String[] args)
       {
            this_Test object = new this_Test(5,10);
            object.display();
       }
}