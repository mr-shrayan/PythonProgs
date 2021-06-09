//Returning an array from a method
import java.util.*;

public class Prog6_2 {
   public int[] createArray() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array that is to be created:: ");
      int size = sc.nextInt();
      int[] myArray = new int[size];
      System.out.println("Enter the elements of the array ::");

      for(int i=0; i<size; i++) {
         myArray[i] = sc.nextInt();
      }
      return myArray;
   }

   public static void main(String args[]) {
      Prog6_2 obj = new Prog6_2();
      int arr[] = obj.createArray();
      System.out.println("Array created is :: "+Arrays.toString(arr));
   }
}