package lesson8;

import lesson7.Bus;

public class Telegram extends Messenger
{
    @Override
    public void testAbstractMethod()
    {
        System.out.println("test abstract method tg");
    }

    public void addStory()
    {
        System.out.println("new story");
    }
}
