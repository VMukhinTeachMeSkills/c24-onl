package lesson10;

//Remove duplicates
public class Main
{
    public static void main(String[] args)
    {
        String str = "Abc 213 gldfg abc 123 Abc 213 456";
        String[] words = str.split(" ");
        String[] uniqueWords = new String[words.length];
        int currentUniqueCounter = 0;
        for (String word: words)
        {
            if (checkUnique(uniqueWords, word))
            {
                uniqueWords[currentUniqueCounter] = word;
                currentUniqueCounter++;
            }
        }
        printUniqueWords(uniqueWords);
    }

    public static void printUniqueWords(String[] uniqueWords)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < uniqueWords.length; i++)
        {
            if (uniqueWords[i] == null)
            {
                break;
            }
            sb.append(uniqueWords[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    public static boolean checkUnique(String[] uniqueWords, String str)
    {
        for (String word: uniqueWords)
        {
            if (word == null)
            {
                return true;
            }
            else
            {
                if (word.equals(str))
                {
                    return false;
                }
            }
        }
        return true;
    }
}

