package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Stock {

    public static void main(String args[]) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserverImpl("testEmail1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertObserverImpl("testEmail2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver notificationAlertObserver3 = new MobileAlertObserverImpl("testEmail3@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(notificationAlertObserver1);
        iphoneStockObservable.add(notificationAlertObserver2);
        iphoneStockObservable.add(notificationAlertObserver3);

//        iphoneStockObservable.addStock(-10);
        iphoneStockObservable.addStock(5);
        iphoneStockObservable.addStock(10);
    }
}
