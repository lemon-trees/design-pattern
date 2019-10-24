package patterns.behavioral.state;

public class GumballMachine
{
    
    /**
     * 机器持有各个状态
     */
    private State hasQuarterState;
    
    private State noQuarterState;
    
    private State soldOutState;
    
    private State soldState;
    
    /**
     * 当前状态
     */
    private State currentState;
    
    /**
     * 当前机器剩余的数量
     */
    private int count = 0;
    
    /**
     * 初始化机器的状态
     * 
     * @param numberGumball
     */
    public GumballMachine(int numberGumball)
    {
        this.hasQuarterState = new HasQuarterState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        
        count = numberGumball;
        
        if(numberGumball > 0)
        {
            currentState = noQuarterState;
        }
        else
        {
            currentState = soldOutState;
        }
    }
    
    public void insertQuarter()
    {
        this.currentState.insertQuarter();
    }
    
    public void ejectQuarter()
    {
        this.currentState.ejectQuarter();
    }
    
    public void turnCrank()
    {
        this.currentState.turnCrank();
        this.currentState.disPens();
    }
    
    public void setCurrentState(State currentState)
    {
        this.currentState = currentState;
    }
    
    public void releaseBall()
    {
        System.out.println("有一个球滚出来...");
        if(count != 0)
        {
            count -= 1;
        }
    }
    
    public State getHasQuarterState()
    {
        return hasQuarterState;
    }
    
    public State getNoQuarterState()
    {
        return noQuarterState;
    }
    
    public State getSoldOutState()
    {
        return soldOutState;
    }
    
    public State getSoldState()
    {
        return soldState;
    }
    
    public State getCurrentState()
    {
        return currentState;
    }
    
    public int getCount()
    {
        return count;
    }
}
