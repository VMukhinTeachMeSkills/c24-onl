package lesson8.figures;

public class Circle implements Shape
{
    private int circleRadius;

    public Circle(int circleRadius)
    {
        this.circleRadius = circleRadius;
    }

    @Override
    public double perimiter()
    {
        return 2 * Math.PI * circleRadius;
    }

    @Override
    public double square()
    {
        return Math.PI * (circleRadius ^ 2);
    }

    public int getCircleRadius()
    {
        return circleRadius;
    }

    public void setCircleRadius(int circleRadius)
    {
        this.circleRadius = circleRadius;
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "circleRadius=" + circleRadius +
                '}';
    }
}
