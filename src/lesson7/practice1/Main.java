package lesson7.practice1;

public class Main
{
    public static void main(String[] args)
    {
        House house = new House();
        Garage garage = new Garage();
        System.out.println("Object 1 type: " + house.getType());
        System.out.println("Object 2 type: " + garage.getType());
    }
}
