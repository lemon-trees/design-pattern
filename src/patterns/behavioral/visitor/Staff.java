package patterns.behavioral.visitor;

import java.util.Random;

/**
 * Element
 */
public abstract class Staff
{
    
    private String name;
    
    private int kpi;
    
    public Staff(String name)
    {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getKpi()
    {
        return kpi;
    }
    
    public abstract void accept(Visitor visitor);
}
