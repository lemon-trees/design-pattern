package patterns.behavioral.state;

public class NoQuarterState implements State
{
    private GumballMachine gumballMachine;
    
    public NoQuarterState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter()
    {
        System.out.println("你插入一个卡币");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }
    
    @Override
    public void ejectQuarter()
    {
        System.out.println("你并没有插入过卡币");
        
    }
    
    @Override
    public void turnCrank()
    {
        System.out.println("请先查入卡币");
    }
    
    @Override
    public void disPens()
    {
        System.out.println("未插入卡币");
        
    }
}
