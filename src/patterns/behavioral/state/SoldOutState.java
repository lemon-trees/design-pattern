package patterns.behavioral.state;

public class SoldOutState implements State
{
    
    private GumballMachine gumballMachine;
    
    public SoldOutState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter()
    {
        System.out.println("你不能插入卡币，当前机器已售罄");
        
    }
    
    @Override
    public void ejectQuarter()
    {
        System.out.println("你没有插入过卡币");
        
    }
    
    @Override
    public void turnCrank()
    {
        System.out.println("当前机器已经售罄");
        
    }
    
    @Override
    public void disPens()
    {
        System.out.println("当前机器已经售罄");
        
    }
}
