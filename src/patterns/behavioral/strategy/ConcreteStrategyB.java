package patterns.behavioral.strategy;

public class ConcreteStrategyB implements Strategy
{
    
    @Override
    public void behavior()
    {
        System.out.println("use strategy B!");
    }
}
