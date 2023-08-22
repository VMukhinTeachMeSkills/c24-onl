package lesson7;

public class Main
{
    public static void main(String[] args)
    {
        Vehicle[] arr = {
                new Car(4),
                new Bus(),
                new Truck()};

        for (int i = 0; i < arr.length; i++)
        {
            arr[i].drive();
        }

        Car car = new Car(4);
        car.drive();
        car.drive(5);
    }
}
