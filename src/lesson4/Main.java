package lesson4;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {9, 5, 6, 2, 1, 15, 6};
        int counter = 0;
        int buf;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    buf = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = buf;
                }
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Counter: " + counter);
    }
}
