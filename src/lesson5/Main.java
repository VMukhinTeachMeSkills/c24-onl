package lesson5;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[][] arr1 = {{5, 5, 5, 4, 15},{5, 5, 5, 4, 6},{5, 5, 5, 4, 6},{5, 5, 5, 4, 6},{5, 5, 5, 4, 6}};

        int a_$;
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println("------------------------------------");

        System.out.println(Arrays.deepToString(arr1));
    }
}
