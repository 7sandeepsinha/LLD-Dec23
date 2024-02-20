package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

//publisher
public class Amazon { // make the Amazon class singleton as we dont want to maintain multiple lists of subscribers

    private List<OrderPlacedSubscriber> orderPlacedSubscribers;

    public Amazon() {
        this.orderPlacedSubscribers = new ArrayList<>();
    }

    public void orderPlaced(){
        /// order place business logic
        for(OrderPlacedSubscriber o : orderPlacedSubscribers){
            o.orderPlaceEvent();
        }
    }

    public void addOrderPlaceSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void removeOrderPlaceSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

}
