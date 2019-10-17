package patterns.behavioral.iterator;

public class ConcreteIterator<T> implements Iterator
{
    
    private Object[] items;
    
    private int position = 0;
    
    public ConcreteIterator(T[] items)
    {
        this.items = items;
    }
    
    @Override
    public T next()
    {
        return (T) items[position++];
    }
    
    @Override
    public boolean hasNext()
    {
        return position < items.length;
    }
}
