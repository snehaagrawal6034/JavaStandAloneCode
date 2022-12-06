package DesignPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {
    private List<Observer<T>> observers = new ArrayList<>();

    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }
    public void notifyObserver(T data) {
        for (Observer<T> observer : observers) {
            observer.consumeData(data);
        }
    }
}
