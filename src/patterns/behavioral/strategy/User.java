package patterns.behavioral.strategy;

public class User
{
    
    private Strategy strategy;
    
    public void DoSomeThing()
    {
        strategy.behavior();
    }
    
    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }
}
