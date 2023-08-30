package lesson9.anonimous;

public class Main
{
    public static void main(String[] args)
    {
        Printable printable = new Printable()
        {
            @Override
            public void print()
            {
                System.out.println("123");
            }
        };

        printable.print();
        System.out.println(printable.getClass());
    }
}
