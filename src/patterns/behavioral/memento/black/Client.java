package patterns.behavioral.memento.black;

/**
 * 黑箱模式
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("on");
        careTaker.saveMemento(originator.createMemento());

        originator.setState("off");
        originator.restoreMemento(careTaker.retrieveMemento());
    }

}
