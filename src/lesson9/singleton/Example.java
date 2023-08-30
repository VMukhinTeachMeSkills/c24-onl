package lesson9.singleton;

import java.util.Arrays;

public class Example
{
    private static Example INSTANCE;

    private Example()
    {
    }

    public static Example getInstance()
    {
        if (INSTANCE == null)
        {
            INSTANCE = new Example();
        }
        return INSTANCE;
    }

    public void printArray(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

}
