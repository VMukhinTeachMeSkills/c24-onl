package lesson11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fileReader = new FileReader("test.txt");
            fileReader.close();
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("File test.txt is not found");
        }
        catch (IOException exception)
        {
            System.out.println("Error when closing the file");
        }
    }
}
