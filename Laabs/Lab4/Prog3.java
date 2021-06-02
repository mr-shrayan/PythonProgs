class Complex { 
  private double real, imaginary; 
     
  // parametrized constructor  
  public Complex(double real, double imaginary) { 
      System.out.println("Parametrized constructor");
      this.real = real; 
      this.imaginary = imaginary; 
  } 
     
  // copy constructor 
  Complex(Complex c) { 
      System.out.println("Copy constructor called"); 
      real = c.real; 
      imaginary = c.imaginary; 
  } 
      
  // Overriding the toString of Object class 
  @Override
  public String toString() { 
      return "(" + real + " + " + imaginary + "i)"; 
  } 
} 
 
public class Prog3 { 
  public static void main(String[] args) { 
      Complex c1 = new Complex(1, 5);     //calls parametrized constructor    
      System.out.println("C1 = " + c1);
      // copy constructor called 
      Complex c2 = new Complex(c1);    
      System.out.println("C2 = " + c2);
      // this is a simple assignment operator 
      
      Complex c3 = c2;    
  } 
}