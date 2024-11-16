package BehaviorDesingPattern.Observer;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;
    EmailAlertObserver(String email, StocksObservable observable){
        this.emailId = email;
        this.observable = observable;
    }
    public void update(){
        // calls a third party API to send email notification
        // observable object will contain info about the product
    }
}
