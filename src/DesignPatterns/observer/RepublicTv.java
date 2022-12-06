package DesignPatterns.observer;


public class RepublicTv implements Observer<Integer> {

    public RepublicTv() {
    }

    public void subscribe() {
        WeatherStation.getInstance().addObserver(this);
    }

    @Override
    public void consumeData(Integer data) {
        System.out.println(getClass().getSimpleName() + " got the temparature" + data);
    }
}
