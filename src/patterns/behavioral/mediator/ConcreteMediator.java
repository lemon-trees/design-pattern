package patterns.behavioral.mediator;

public class ConcreteMediator extends Mediator
{
    
    private AlarmColleague alarmColleague;
    
    private CoffeePotColleague coffeePotColleague;
    
    public ConcreteMediator(AlarmColleague alarmColleague, CoffeePotColleague coffeePotColleague)
    {
        this.alarmColleague = alarmColleague;
        this.coffeePotColleague = coffeePotColleague;
    }
    
    @Override
    public void doEvent(String eventType)
    {
        switch (eventType)
        {
            case "alarm":
                doAlarmEvent();
                break;
            case "coffeePot":
                doCoffeePot();
                break;
            default:
                System.out.println("eventType not define");
        }
    }
    
    public void doAlarmEvent()
    {
        alarmColleague.doAlarm();
        coffeePotColleague.doCoffeePot();
    }
    
    public void doCoffeePot()
    {
        coffeePotColleague.doCoffeePot();
        alarmColleague.doAlarm();
    }
    
}
