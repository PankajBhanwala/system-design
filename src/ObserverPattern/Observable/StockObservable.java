package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver obj);
    void remove(NotificationAlertObserver obj);
    void sendAlert();
    int getStock();
    void addStock(int newStock);
}
