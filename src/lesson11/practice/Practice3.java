package lesson11.practice;

public class Practice3
{
    public static void method1(String str)
    {
        try {
            Integer.parseInt(str);
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Invalid sting, not a number");
        }
    }

    public static void method2(String str)
    {
        try {
            int number = Integer.parseInt(str);
            System.out.println(number / 0);
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Invalid sting, not a number");
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Invalid arithmetic operation");
        }
    }

    public static void method3(String str)
    {
        try {
            int number = Integer.parseInt(str);
            System.out.println(number / 0);
        }
        catch (NumberFormatException | ArithmeticException exception)
        {
            System.out.println("Invalid sting, not a number or arithmetic operation");
        }
    }

    public static void method4(String str)
    {
        try {
            int number = Integer.parseInt(str);
            System.out.println(number / 0);
        }
        catch (NumberFormatException | ArithmeticException exception)
        {
            System.out.println("Invalid sting, not a number or arithmetic operation");
        }
        finally
        {
            System.out.println("Finished method 4 operation");
        }
    }
}
