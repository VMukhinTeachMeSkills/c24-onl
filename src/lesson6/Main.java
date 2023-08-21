package lesson6;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Car car = new Car();

        int sumResult = car.sum(10, 5);
        System.out.println("Result of sum " + sumResult);
        car.drive();
        car.drive("Slava", 1, 2);
    }
}



















