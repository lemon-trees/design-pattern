package patterns.behavioral.observer;

public class StatisticsDisplay implements Observer
{
    
    public StatisticsDisplay(Subject weatherData)
    {
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure)
    {
        System.out.println("StatisticsDisplay 收到通知。。。。"+temp+humidity+pressure);
    }
}
