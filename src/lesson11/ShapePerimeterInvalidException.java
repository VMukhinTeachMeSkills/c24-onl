package lesson11;

import lesson8.figures.Shape;

public class ShapePerimeterInvalidException extends RuntimeException
{
    private Shape shape;

    public ShapePerimeterInvalidException(String message, Shape shape)
    {
        super(message);
        this.shape = shape;
    }

    public Shape getShape()
    {
        return shape;
    }

    public void setShape(Shape shape)
    {
        this.shape = shape;
    }
}
