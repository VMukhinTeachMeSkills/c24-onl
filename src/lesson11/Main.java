package lesson11;

import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(testMethod());
    }

    public static int testMethod()
    {
        int[] arr = {1, 2, 3};
        try
        {
            for (int i = 0; i < 4; i++)
            {
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("We caught some exception!!!");
            return 1;
        }
        finally
        {
            System.out.println("finally we passed this construction");
            return -1;
        }
    }
}
