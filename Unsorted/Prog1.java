//Program to print the name and address of the user.
import java.util.*;

class Program
{
	public static void main(String[] args)
	{
		String name, address;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = input.nextLine();
		System.out.println();
		System.out.println("Enter your Address: ");
		address = input.nextLine();
		System.out.println();
		System.out.println("Your name is: " + name);
		System.out.println("Your Address is:" +address);
	}

}