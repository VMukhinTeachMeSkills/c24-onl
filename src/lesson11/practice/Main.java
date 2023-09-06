package lesson11.practice;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("Method 1 ---------------------------------------------");
        Practice3.method1(str);
        System.out.println("Method 2 ---------------------------------------------");
        Practice3.method2(str);
        System.out.println("Method 3 ---------------------------------------------");
        Practice3.method3(str);
        System.out.println("Method 4 ---------------------------------------------");
        Practice3.method4(str);
    }
}
