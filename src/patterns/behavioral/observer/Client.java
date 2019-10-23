package patterns.behavioral.observer;

/**
 * 观察者模式
 */
public class Client
{
    public static void main(String[] args)
    {
        Subject weatherData = new WeatherData();
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        Observer currentConditonDisplay = new CurrentConditionDisplay(weatherData);
        
        ((WeatherData) weatherData).setMeasurements(0, 0, 0);
        ((WeatherData) weatherData).setMeasurements(1, 1, 1);
        
        weatherData.removeObserver(statisticsDisplay);
        
        ((WeatherData) weatherData).setMeasurements(2, 2, 2);
        
    }
}
