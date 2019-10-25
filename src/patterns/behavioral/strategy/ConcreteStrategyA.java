package patterns.behavioral.strategy;

public class ConcreteStrategyA implements Strategy
{
    
    @Override
    public void behavior()
    {
        System.out.println("use strategy A!");
    }
}
