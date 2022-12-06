package DesignPatterns.observer;

// Observable - data source
// Observer - the one who listens to the data.

public class WeatherStation extends Observable<Integer> {

    private static final WeatherStation WEATHER_STATION = new WeatherStation(); // eager initialization

    private WeatherStation() {}

    public  static WeatherStation getInstance() {
        return WEATHER_STATION;
    }

    public void updateTemperatureFromSensor(int temperatureInCelsius) {
        notifyObserver(temperatureInCelsius);
    }
}
