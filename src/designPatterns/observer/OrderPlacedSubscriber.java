package designPatterns.observer;

public interface OrderPlacedSubscriber { // any class that will implement this interface will be a subscriber to order place event
    void orderPlaceEvent();
}
