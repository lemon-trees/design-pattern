package patterns.behavioral.memento.black;

public class CareTaker
{
    private MementoIf memento;
    
    public MementoIf retrieveMemento()
    {
        return memento;
    }
    
    public void saveMemento(MementoIf memento)
    {
        this.memento = memento;
    }
    
}
