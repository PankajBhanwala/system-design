package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public MobileAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Sending notification on mobile corresponding to emailId : " + emailId);
        System.out.println("Hurry up, " + observable.getStock() + "products available now");
    }
}
