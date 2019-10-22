package patterns.behavioral.memento.wihte;

/**
 * 备忘录白箱模式
 */
public class Client
{
    
    public static void main(String[] args)
    {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        
        originator.setState("on");
        // 保存发起人的状态
        careTaker.saveMemento(originator.createMemento());
        
        originator.setState("off");
        // 恢复发起人的状态
        originator.restoreMemento(careTaker.retrieveMemento());
        
        System.out.println(originator.getState());
    }
    
}
