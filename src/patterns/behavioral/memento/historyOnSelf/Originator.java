package patterns.behavioral.memento.historyOnSelf;

public class Originator
{
    
    private String state;
    
    public void changeState(String state)
    {
        this.state = state;
        System.out.println("当前状态：" + state);
    }
    
    public Memento createMemento()
    {
        return new Memento(this);
    }
    
    public void restoreMemento(MementoIf mementoIf)
    {
        Memento memento = (Memento) mementoIf;
        changeState(memento.getState());
    }
    
    private class Memento implements MementoIf
    {
        private String state;
        
        public Memento(Originator originator)
        {
            this.state = originator.state;
        }
        
        public String getState()
        {
            return state;
        }
    }
    
}
