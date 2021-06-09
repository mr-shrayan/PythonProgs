// Java program to demonstrate objects 
// passing to methods. 
class ObjectPassDemo 
{ 
    int a, b; 
  
    ObjectPassDemo(int i, int j) 
    { 
        a = i; 
        b = j; 
    } 
  
    // return true if o is equal to the invoking 
    // object notice an object is passed as an 
    // argument to method 
    boolean equalTo(ObjectPassDemo o) 
    { 
        return (o.a == a && o.b == b); 
    } 
} 

class ObjectReturnDemo 
{ 
    int c; 
  
    ObjectReturnDemo(int d) 
    { 
        c = d; 
    } 
  
    // This method returns an object 
    ObjectReturnDemo incrByTen() 
    { 
        ObjectReturnDemo temp = 
               new ObjectReturnDemo(c+10); 
        return temp; 
    } 
} 
  
// Driver class 
public class Prog2 
{ 
    public static void main(String args[]) 
    { 
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22); 
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22); 
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1); 
        System.out.println("\n \tObject Passing to Methods\n");
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2)); 
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3)); 

//

        ObjectReturnDemo ob4 = new ObjectReturnDemo(2); 
        ObjectReturnDemo ob5; 
  
        ob5 = ob4.incrByTen(); 
        System.out.println("\n \tObject Returning from Methods\n");
        System.out.println("ob4.c: " + ob4.c); 
        System.out.println("ob5.c: " + ob5.c); 
    } 
} 