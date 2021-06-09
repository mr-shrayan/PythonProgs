class maxClass
{
    public int find_max(int [] myarray) 
    {
        int max_val = 0;
       //traverse the array to compare each element with max_val
       for(int i=0; i<myarray.length; i++ ) {
          if(myarray[i]>max_val) {
             max_val = myarray[i];
          }
       }
       //return max_val
       return max_val;
    }
}
public class Prog6
{

    public static String[] return_Array() 
    {
        //define string array
        String[] ret_Array = {"Java", "C++", "Python", "Ruby", "C"};
       //return string array
       return ret_Array;
    }
    public static void main(String args[]) 
    {
         //input array   
        int[] myArray = {43,54,23,65,78,85,88,92,10};
        System.out.println("Input Array:" + Arrays.toString(myArray));
  
       //create object of class which has method to find maximum
       maxClassobj = new maxClass();
         //pass input array to find_max method that returns maximum element
         System.out.println("Maximum value in the given array is::"+obj.find_max(myArray));

         //call method return_array that returns array   
     String[] str_Array = return_Array();
     System.out.println("Array returned from method:" + Arrays.toString(str_Array));
    }
}