package lesson8.figures;

public class Rectangle implements Shape
{
    private int height;
    private int width;

    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    @Override
    public double perimiter()
    {
        return 2 * (height + width);
    }

    @Override
    public double square()
    {
        return height * width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }
}
