package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        int[][][] arr = {{{1, 2, 3}, {4, 5}, {7}}, {{100, 4, 6, 8}, {4, 5, 6}}, {{1, 2}, {1}, {1}, {3, 4}}};
        System.out.println(Arrays.deepToString(arr));
        Scanner scanner;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                for (int k = 0; k < arr[i][j].length; k++)
                {
                    count++;
                }
            }
        }
        System.out.println("Result " + count);
    }
}
