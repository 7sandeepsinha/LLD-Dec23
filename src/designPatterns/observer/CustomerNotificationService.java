package designPatterns.observer;

//this class holds to logic to send SMS and email to users when order is placed
public class CustomerNotificationService implements OrderPlacedSubscriber{
    @Override
    public void orderPlaceEvent() {
        System.out.println("Send SMS to customer");
        System.out.println("Send email to customer");
    }
}
