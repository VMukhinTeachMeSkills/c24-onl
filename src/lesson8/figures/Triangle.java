package lesson8.figures;

public class Triangle implements Shape
{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimiter()
    {
        return side1 + side2 + side3;
    }

    @Override
    public double square()
    {
        double polu = (double) (side1 + side2 + side3) /2;
        double polu1 = polu - side1;
        double polu2 = polu - side2;
        double polu3 = polu - side3;
        double p2 = (polu * polu1 * polu2 * polu3);
        return Math.sqrt(p2);
    }

    public int getSide1()
    {
        return side1;
    }

    public void setSide1(int side1)
    {
        this.side1 = side1;
    }

    public int getSide2()
    {
        return side2;
    }

    public void setSide2(int side2)
    {
        this.side2 = side2;
    }

    public int getSide3()
    {
        return side3;
    }

    public void setSide3(int side3)
    {
        this.side3 = side3;
    }
}
