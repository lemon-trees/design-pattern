package patterns.behavioral.memento.multiCheckPoint;

public class Client
{
    
    public static void main(String[] args)
    {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker(originator);
        
        originator.setStates("state 1");
        careTaker.createMemento();
        
        originator.setStates("state 2");
        careTaker.createMemento();
        
        originator.setStates("state 3");
        careTaker.createMemento();
        
        originator.setStates("state 4");
        careTaker.createMemento();
        
        originator.printState();
        
        System.out.println("恢复检查点");
        
        careTaker.restoreMemento(2);
        originator.printState();
        
    }
    
}
