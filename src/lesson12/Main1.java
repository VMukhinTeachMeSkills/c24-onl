package lesson12;

import java.io.*;

public class Main1
{
    public static void main(String[] args)
    {
        File inputFile = new File("/home/user/c24-onl/resources/test.txt");
        File outputFile = new File("/home/user/c24-onl/resources/test1.txt");
        try
        {
            FileReader fileReader = new FileReader(inputFile);
            FileWriter fileWriter = new FileWriter(outputFile);
            char[] arr = new char[100];
            fileReader.read(arr);
            fileWriter.write("Content from test.txt: \n");
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] != Character.MIN_VALUE)
                {
                    fileWriter.write(arr[i]);
                }
            }

            fileReader.close();
            fileWriter.close();
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
