package DesignPatterns.observer;


public class AajTakTv implements Observer<Integer> {

    public AajTakTv() {
    }

    public void subscribe() {
        WeatherStation.getInstance().addObserver(this);
    }

    @Override
    public void consumeData(Integer data) {
        System.out.println("Aaj tak tv got weather" + data);
    }
}
