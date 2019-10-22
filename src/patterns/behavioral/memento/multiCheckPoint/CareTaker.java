package patterns.behavioral.memento.multiCheckPoint;

import java.util.ArrayList;
import java.util.List;

public class CareTaker
{
    
    private Originator originator;
    
    private List<Memento> mementos = new ArrayList<>();
    
    private int current;
    
    public CareTaker(Originator originator)
    {
        this.originator = originator;
        current = 0;
    }
    
    public int createMemento()
    {
        Memento memento = originator.createMemento();
        mementos.add(memento);
        return current++;
    }
    
    public void restoreMemento(int index)
    {
        Memento memento = mementos.get(index);
        originator.restoreMemento(memento);
    }
    
    public void removeMemento(int index)
    {
        mementos.remove(index);
    }
}
