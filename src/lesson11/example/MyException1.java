package lesson11.example;

public class MyException1 extends RuntimeException
{
    private String field1;

    public String getField1()
    {
        return field1;
    }

    public void setField1(String field1)
    {
        this.field1 = field1;
    }
}
