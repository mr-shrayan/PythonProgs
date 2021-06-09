/* Invoking the class method with "this" */
class Test_this {
 
    void print()
    {
        // calling fuction show()
       this.show();
 
       System.out.println("Test_this:: print");
    }
 
    void show() {
        System.out.println("Test_this:: show");
    }
}
 
class Prog3_3{    
    public static void main(String args[]) {
        Test_this thist = new Test_this();
        thist.print();
    }
}
