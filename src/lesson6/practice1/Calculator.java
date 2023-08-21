package lesson6.practice1;

public class Calculator
{
    float weight;
    double cost;
    String color;

    public Calculator(float weight, double cost, String color)
    {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
        System.out.println("Creating calculator");
    }

    int sum(int a, int b)
    {
        return a + b;
    }

    int subtract(int a, int b)
    {
        return a - b;
    }

    double divide(int a, int b)
    {
        return ((double) a) / b;
    }

    int multiplication(int a, int b)
    {
        return a * b;
    }
}
