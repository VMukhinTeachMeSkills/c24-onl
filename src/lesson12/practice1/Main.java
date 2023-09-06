package lesson12.practice1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        File file = new File("tms.txt");
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(data.getBytes(StandardCharsets.UTF_8));

            fileOutputStream.close();
        }
        catch (IOException exception)
        {
            System.out.println("Error when operating with stream " + exception.getMessage());
        }

        try
        {
            FileInputStream fileInputStream = new FileInputStream(file);

            String content = new String(fileInputStream.readAllBytes(), StandardCharsets.UTF_8);
            System.out.println(content.replace(' ', '_'));

            fileInputStream.close();
        }
        catch (IOException exception)
        {
            System.out.println("Error when operating with stream " + exception.getMessage());
        }
    }
}
