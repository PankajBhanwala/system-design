package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    int stock = 0;
    List<NotificationAlertObserver> observers = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver obj) {
        observers.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observers.remove(obj);
    }

    @Override
    public void sendAlert() {
        for (NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void addStock(int newStock) {
        if (newStock < 0) {
            throw new IllegalArgumentException();
        }
        stock += newStock;
        if (stock - newStock == 0) {
            sendAlert();
        }
    }
}
