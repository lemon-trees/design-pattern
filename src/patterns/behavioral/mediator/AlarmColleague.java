package patterns.behavioral.mediator;

public class AlarmColleague extends Colleague
{
    
    @Override
    public void onEvent(Mediator mediator)
    {
        mediator.doEvent("alarm");
    }
    
    public void doAlarm()
    {
        System.out.println("doAlarm()");
    }
}
