package designPatterns.observer;

public class Main {
    public static void main(String[] args) {
        CustomerNotificationService customerNotificationService = new CustomerNotificationService();
        InvoiceGeneratorService invoiceGeneratorService = new InvoiceGeneratorService();
        Amazon amazon = new Amazon();
        //added the subscribers to the publishers list
        amazon.addOrderPlaceSubscriber(customerNotificationService);
        amazon.addOrderPlaceSubscriber(invoiceGeneratorService);

        amazon.orderPlaced();

        amazon.removeOrderPlaceSubscriber(invoiceGeneratorService);

        amazon.orderPlaced();
    }
}
