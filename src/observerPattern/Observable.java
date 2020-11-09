package observerPattern;

import java.util.LinkedList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new LinkedList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this, null);
        }
    }

    public void notifyObservers(Object object) {
        for (Observer observer : observers) {
            observer.update(this, object);
        }
    }
}
