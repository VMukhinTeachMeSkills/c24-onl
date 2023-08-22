package lesson7;

public class Truck extends Vehicle
{
    private float loadCapacity;

    public void drive()
    {
        System.out.println(getVin() + " driving, max speed " + getMaxSpeed() + ", capacity " + loadCapacity);
    }
}
