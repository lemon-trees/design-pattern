package patterns.behavioral.iterator;

import java.util.ArrayList;

public class ConcreteAggregate<T> implements Aggregate
{
    
    private Object[] items;
    
    public ConcreteAggregate()
    {
        this.items = new Object[10];
        for(int i = 0; i < 10; i++)
        {
            items[i] = i;
        }
    }
    
    @Override
    public Iterator createIterator()
    {
        return new ConcreteIterator(items);
    }
    
}
