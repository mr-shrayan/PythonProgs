//Array Of Objects
class Prog1 {

	public static void main(String args[])
	{
		Student[] arr;

		// Allocating memory for 2 objects of type student
		arr = new Student[2];

		arr[0] = new Student(1010, "Shrayan");
		arr[1] = new Student(1011, "Ankit");

		// Student Information
		System.out.println(
			"\nStudent Information in array position 0: ");
		arr[0].display();

		System.out.println(
			"\nStudent Information in array position 1: ");
		arr[1].display();
	}
}

class Student 
{
	public int id;
	public String name;

	Student(int id, String name)//student class constructor
	{
		this.id = id;
		this.name = name;
	}

public void display() // display method to display stydent data
	{
		System.out.println("Student id is: " + id + " "
			            + " \nStudent name is: "
						+   name);
		System.out.println();
	}
}

