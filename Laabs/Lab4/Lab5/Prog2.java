// Passing an object to the method
class ObjectPassMethod 
{ 
    int a, b; 
  
    ObjectPassMethod(int i, int j) 
    { 
        a = i; 
        b = j; 
    } 
  
    // return true if o is equal to the invoking object
    boolean equalTo(ObjectPassMethod o) 
    { 
        return (o.a == a && o.b == b); 
    } 
} 
// Returning the object from the method
class ObjectReturnMethod 
{ 
    int c; 
  
    ObjectReturnMethod(int d) 
    { 
        c = d; 
    } 
  
    // This method returns an object 
    ObjectReturnMethod incrByTen() 
    { 
        ObjectReturnMethod temp = new ObjectReturnMethod(c+10); 
        return temp; 
    } 
} 
  
// Driver class 
public class Prog2 
{ 
    public static void main(String args[]) 
    { 
/* ---------------------Passing An Object--------------------------*/

        ObjectPassMethod ob1 = new ObjectPassMethod(100, 22); 
        ObjectPassMethod ob2 = new ObjectPassMethod(100, 22); 
        ObjectPassMethod ob3 = new ObjectPassMethod(10, 20); 
        
        System.out.println("\n \tObject Passing to Methods\n");
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2)); 
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3)); 

/* ---------------------Returning An Object--------------------------*/

        ObjectReturnMethod ob4 = new ObjectReturnMethod(2); 
        ObjectReturnMethod ob5; 
  
        ob5 = ob4.incrByTen(); 
        System.out.println("\n \tObject Returning from Methods\n");
        System.out.println("ob4.c: " + ob4.c); 
        System.out.println("ob5.c: " + ob5.c); 
    } 
} 