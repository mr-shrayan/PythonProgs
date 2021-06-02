//Java Program to demonstrate the use of static variable  
class Student{  
    int rollno;//instance variable  
    String name;  
    static String college ="ITS";//static variable  
    //constructor  
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display the values  
    void display (){System.out.println(rollno+" "+name+" "+college);}  
 }  
 //Test class to show the values of objects  
 public class prob4_1{  
  public static void main(String args[]){  
  Student s1 = new Student(228,"Shrayan");  
  Student s2 = new Student(11,"Simran");  
  s1.display();  
  s2.display();  
  }  
 }  