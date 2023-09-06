package lesson12;

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        File inputFile = new File("/home/user/c24-onl/resources/test.txt");
        File outputFile = new File("/home/user/c24-onl/resources/test1.txt");
        try
        {
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

            byte[] content = fileInputStream.readAllBytes();
            for (int i = 0; i < content.length; i++)
            {
                content[i]++;
            }
            fileOutputStream.write(content);

            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("File not found, " + exception.getMessage());
        }
        catch (IOException exception)
        {
            System.out.println("Error when closing file, " + exception.getMessage());
        }
    }
}
