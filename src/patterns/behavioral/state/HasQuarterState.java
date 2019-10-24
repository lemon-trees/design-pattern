package patterns.behavioral.state;

public class HasQuarterState implements State
{
    
    private GumballMachine gumballMachine;
    
    public HasQuarterState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter()
    {
        System.out.println("不能插入卡币");
        
    }
    
    @Override
    public void ejectQuarter()
    {
        System.out.println("退回卡币");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        
    }
    
    @Override
    public void turnCrank()
    {
        System.out.println("你开始摇动手杆");
        gumballMachine.setCurrentState(gumballMachine.getSoldState());
        
    }
    
    @Override
    public void disPens()
    {
        System.out.println("当前机器没有球");
    }
}
