package lesson6.practice1;

public class Main
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator(105.5f, 50, "Black");
        System.out.println(calculator.sum(10, 16));
        System.out.println(calculator.subtract(10, 16));
        System.out.println(calculator.divide(10, 16));
        System.out.println(calculator.multiplication(10, 16));
        System.out.println("Calculator: weight - " + calculator.weight + ", cost - " + calculator.cost + ", color - " + calculator.color);

    }
}
