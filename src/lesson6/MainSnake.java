package lesson6;

import java.util.Scanner;

public class MainSnake
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr = new int[a][b];

        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = 0; j < arr[i].length; j++)
                {
                    arr[i][j] = count;
                    count++;
                }
            }
            else
            {
                for (int j = arr[i].length - 1; j >= 0; j--)
                {
                    arr[i][j] = count;
                    count++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
