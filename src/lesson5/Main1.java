package lesson5;

import java.util.Arrays;
import java.util.Random;

public class Main1
{
    public static void main(String[] args)
    {
        int[][] arr = new int[4][5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max: " + max);
    }
}
