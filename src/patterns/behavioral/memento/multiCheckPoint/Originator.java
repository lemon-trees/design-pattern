package patterns.behavioral.memento.multiCheckPoint;

import java.util.ArrayList;
import java.util.List;

public class Originator
{
    
    private List<String> states;
    
    private int index;
    
    public Originator()
    {
        this.states = new ArrayList<>();
        this.index = 0;
    }
    
    public Memento createMemento()
    {
        //备份一个
        return new Memento(new ArrayList<>(states), index);
    }
    
    public void restoreMemento(Memento memento)
    {
        this.states = memento.getStates();
        this.index = memento.getIndex();
        
    }
    
    public void setStates(String state)
    {
        this.states.add(state);
        index++;
    }
    
    public void printState()
    {
        for(String state : this.states)
        {
            System.out.println(state);
        }
    }
}
