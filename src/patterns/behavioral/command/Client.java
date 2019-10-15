package patterns.behavioral.command;

/**
 * 命令模式：
 */
public class Client
{
    public static void main(String[] args)
    {
        Invoker invoker = Invoker.getInstance();
        invoker.lightOn();
        invoker.lightOff();
    }
}
