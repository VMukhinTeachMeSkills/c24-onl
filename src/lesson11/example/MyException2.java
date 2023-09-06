package lesson11.example;

public class MyException2 extends RuntimeException
{
    private String field2;

    public String getField2()
    {
        return field2;
    }

    public void setField2(String field2)
    {
        this.field2 = field2;
    }
}
