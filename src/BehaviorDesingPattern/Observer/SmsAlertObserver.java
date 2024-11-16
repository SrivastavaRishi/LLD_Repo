package BehaviorDesingPattern.Observer;

public class SmsAlertObserver implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;
    SmsAlertObserver(String email, StocksObservable observable){
        this.emailId = email;
        this.observable = observable;
    }
    public void update(){
        // calls a third party API to send email notification
        // observable object will contain info about the product
    }
}