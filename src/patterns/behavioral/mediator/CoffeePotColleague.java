package patterns.behavioral.mediator;

public class CoffeePotColleague extends Colleague
{
    
    @Override
    public void onEvent(Mediator mediator)
    {
        mediator.doEvent("coffeePot");
    }
    
    public void doCoffeePot()
    {
        System.out.println("doCoffeePot()");
    }
}
