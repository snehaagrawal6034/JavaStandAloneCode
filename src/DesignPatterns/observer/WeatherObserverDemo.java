package DesignPatterns.observer;

public class WeatherObserverDemo {

    public static void main(String[] args) {
        RepublicTv republicTv = new RepublicTv();
        republicTv.subscribe();
        AajTakTv aajTakTv = new AajTakTv();
        aajTakTv.subscribe();
        WeatherStation.getInstance().updateTemperatureFromSensor(1000);
        System.out.println("subscription done");
    }
}
