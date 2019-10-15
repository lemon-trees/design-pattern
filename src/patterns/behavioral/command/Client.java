package patterns.behavioral.command;

/**
 * 命令模式：
 */
public class Client
{
    public static void main(String[] args)
    {
        Invoker invoker = new Invoker();
        invoker.lightOn();
        invoker.lightOff();
    }
}
