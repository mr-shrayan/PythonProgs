//  args= []

import java.util.*;
class Prog3
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("Atleast 1 integer is required");
            System.exit(0);
        }
            Maximum(args);
    }
}

static void Maximum(String[] strValues)
{
int numMax = numbers[0];
    for (int i = 0; i < strValues.length; i++)
    {
    int numbers = Integer.parseInt(strValues[i]);
        if(numbers[i] > numMax)
        {
            numMax = numbers[i];
            System.out.println(numMax);
            {}
            System.out.println(numMax);
        }
    }
}
