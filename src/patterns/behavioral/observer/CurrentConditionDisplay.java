package patterns.behavioral.observer;

public class CurrentConditionDisplay implements Observer
{
    
    public CurrentConditionDisplay(Subject weatherDate)
    {
        weatherDate.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure)
    {
        System.out.println("CurrentConditionDisplay 收到通知。。。" + temp + humidity + pressure);
        
    }
}
