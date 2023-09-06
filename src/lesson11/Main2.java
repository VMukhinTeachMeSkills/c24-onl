package lesson11;

import lesson8.figures.Circle;
import lesson8.figures.Rectangle;
import lesson8.figures.Shape;

import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        try
        {
            Shape[] shapes =
                    {
                            new Circle(3),
                            new Rectangle(5, 6)
                    };
            testMethod(shapes);
        }
        catch (ShapePerimeterInvalidException exception)
        {
            System.out.println("invalid perimeter, message: " + exception.getMessage() +
                    ", invalid shape: " + exception.getShape());
            exception.printStackTrace();
        }
    }

    public static void testMethod(Shape[] shapes) throws ShapePerimeterInvalidException
    {
        for (Shape shape : shapes)
        {
            if (shape.perimiter() < 20)
            {
                ShapePerimeterInvalidException exception = new ShapePerimeterInvalidException("perimiter < 20", shape);
                throw exception;
            }
        }
    }
}
