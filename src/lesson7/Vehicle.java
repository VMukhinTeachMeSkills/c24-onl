package lesson7;

public class Vehicle
{
    private String vin;
    private int maxSpeed;

    public Vehicle()
    {
        vin = "Slava1";
        maxSpeed = 251;
    }

    public Vehicle(String vin, int maxSpeed)
    {
        this.vin = vin;
        this.maxSpeed = maxSpeed;
    }

    public void drive()
    {
        System.out.println(vin + " driving, max speed " + maxSpeed);
    }

    public void drive(int a)
    {

    }

    public String getVin()
    {
        return vin;
    }

    public void setVin(String vin)
    {
        this.vin = vin;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
}