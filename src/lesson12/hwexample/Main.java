package lesson12.hwexample;

public class Main
{
    public static void main(String[] args)
    {
        String[] arr = {
                "adfva",
                "aaaatghtht",
                "gh123"
        };

        for (String word: arr)
        {
            if (checkUniqueWord(word))
            {
                System.out.println("Result: " + word);
                break;
            }
        }
    }

    public static boolean checkUniqueWord(String word)
    {
        char[] uniqueSymbols = new char[word.length()];
        int currentSize = 0;

        for (char symbol : word.toCharArray())
        {
            for (int i = 0; i < uniqueSymbols.length; i++)
            {
                if (uniqueSymbols[i] == symbol)
                {
                    return false;
                }
                else if (i == currentSize)
                {
                    uniqueSymbols[currentSize] = symbol;
                    currentSize++;
                    break;
                }
            }
        }

        return true;
    }
}
