package patterns.behavioral.strategy;

/**
 * 策略模式
 */
public class Client
{
    public static void main(String[] args)
    {
        User user = new User();
        user.setStrategy(new ConcreteStrategyA());
        user.DoSomeThing();
        
        user.setStrategy(new ConcreteStrategyB());
        user.DoSomeThing();
    }
}
