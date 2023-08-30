package lesson9.blocks;

public class A
{
    static
    {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    public A()
    {
        System.out.println("3");
    }
}
