package patterns.behavioral.mediator;

/**
 * 中介者模式：集中相关对象之间复杂的沟通和控制方式。
 */
public class Client
{
    public static void main(String[] args)
    {
        AlarmColleague alarmColleague = new AlarmColleague();
        CoffeePotColleague coffeePotColleague = new CoffeePotColleague();
        
        Mediator mediator = new ConcreteMediator(alarmColleague, coffeePotColleague);
        alarmColleague.onEvent(mediator);
    }
}
