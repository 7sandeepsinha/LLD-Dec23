package designPatterns.adapter;

public interface BankAPIAdapter {
    double checkBalance(User user);
    int doTransaction(User fromUser, User toUser, double amount);
    boolean changePin(User user, int currentPin, int newPin);

}
