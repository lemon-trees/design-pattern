package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject
{
    
    private List<Observer> observers;
    
    private float temperature;
    
    private float humidity;
    
    private float pressure;
    
    public WeatherData()
    {
        this.observers = new ArrayList<>();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
    
    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
        
    }
    
    @Override
    public void removeObserver(Observer observer)
    {
        int i = observers.indexOf(observer);
        if(i >= 0)
        {
            observers.remove(i);
            
        }
        
    }
    
    @Override
    public void notifyObserver()
    {
        System.out.println("WeatherData 发出通知");
        for(Observer observer : observers)
        {
            observer.update(temperature, humidity, pressure);
        }
        
    }
}
