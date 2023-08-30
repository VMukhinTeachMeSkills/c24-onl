package lesson7;

import java.util.Objects;

public class Car extends Vehicle
{
    private int wheelsAmount;

    public Car(int wheelsAmount)
    {
        this.wheelsAmount = wheelsAmount;
    }

    public Car(String vin, int maxSpeed, int wheelsAmount)
    {
        super(vin, maxSpeed);
        this.wheelsAmount = wheelsAmount;
    }

    @Override
    public void drive()
    {
        System.out.println(getVin() + " driving, max speed " + getMaxSpeed() + ", wheels amount " + wheelsAmount);
    }
}
