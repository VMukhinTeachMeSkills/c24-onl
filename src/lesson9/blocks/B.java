package lesson9.blocks;

public class B extends A
{
    static
    {
        System.out.println("4");
    }

    {
        System.out.println("5");
    }

    public B()
    {
        System.out.println("6");
    }
}
