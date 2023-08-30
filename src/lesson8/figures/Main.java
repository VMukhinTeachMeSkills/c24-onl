package lesson8.figures;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Shape[] shapes =
                {
                        new Circle(5),
                        new Triangle(1, 2, 3),
                        new Rectangle(8, 9),
                        new Circle(6),
                        new Rectangle(4, 6)
                };

        double sum = 0;
        for (int i = 0; i < shapes.length; i++)
        {
            sum+= shapes[i].perimiter();
        }
        System.out.println(sum);
    }
}
