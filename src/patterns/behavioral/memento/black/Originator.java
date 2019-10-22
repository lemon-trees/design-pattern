package patterns.behavioral.memento.black;

public class Originator
{
    
    private String state;
    
    public String getState()
    {
        return state;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public MementoIf createMemento()
    {
        return new Memento(state);
    }
    
    public void restoreMemento(MementoIf mementoIf)
    {
        this.setState(((Memento) mementoIf).getState());
    }
    
    private class Memento implements MementoIf
    {
        private String state;
        
        public Memento(String state)
        {
            this.state = state;
        }
        
        public String getState()
        {
            return state;
        }
        
        public void setState(String state)
        {
            this.state = state;
        }
    }
    
}
