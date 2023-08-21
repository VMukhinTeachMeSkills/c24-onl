package lesson6;

public class Car
{
    String vin;
    int maxSpeed = 249;

    {
        vin = "Slava";
        maxSpeed = 250;
    }

    Car()
    {
        vin = "Slava1";
        maxSpeed = 251;
    }

    void drive(String name, int ...numbers)
    {
        System.out.println(name + " driving");
    }

    void drive()
    {

    }

    int sum(int a, int b)
    {
        return a + b;
    }
}