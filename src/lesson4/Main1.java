package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        int[] arr = generateRandomArray();
        System.out.println("Your random array:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] *= arr[i];
        }
        System.out.println("Your random array modified:");
        System.out.println(Arrays.toString(arr));
    }

    public static int[] generateRandomArray()
    {
        Scanner scanner = new Scanner(System.in);
        int arrSize;
        System.out.println("Please input array size > 0:");
        if (scanner.hasNextInt())
        {
            arrSize = scanner.nextInt();
        }
        else
        {
            System.out.println("Incorrect input.");
            return null;
        }
        if (arrSize <= 0)
        {
            System.out.println("Incorrect input.");
            return null;
        }

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++)
        {
            arr[i] = Math.round((float) (Math.random() * 10));
        }

        return arr;
    }
}
