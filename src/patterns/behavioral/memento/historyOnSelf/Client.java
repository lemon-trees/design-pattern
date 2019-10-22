package patterns.behavioral.memento.historyOnSelf;

/**
 * 自述历史模式
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.changeState("state 1");
        MementoIf mementoIf = originator.createMemento();

        originator.changeState("state 2");

        originator.restoreMemento(mementoIf);
    }

}
