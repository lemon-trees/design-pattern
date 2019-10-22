package patterns.behavioral.memento.wihte;

public class CareTaker
{
    
    private Memento memento;
    
    public Memento retrieveMemento()
    {
        
        return this.memento;
    }
    
    public void saveMemento(Memento memento)
    {
        this.memento = memento;
    }
    
}
