package patterns.behavioral.state;

public class SoldState implements State
{
    private GumballMachine gumballMachine;
    
    public SoldState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter()
    {
        System.out.println("你已经插入过卡币");
        
    }
    
    @Override
    public void ejectQuarter()
    {
        System.out.println("不好意思，你已经使用过，不能退还卡币");
        
    }
    
    @Override
    public void turnCrank()
    {
        System.out.println("一个卡币只能摇一次手杆");
    }
    
    @Override
    public void disPens()
    {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0)
        {
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        }
        else
        {
            System.out.println("机器已售罄");
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        }
        
    }
}
