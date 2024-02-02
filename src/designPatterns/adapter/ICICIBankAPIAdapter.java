package designPatterns.adapter;

public class ICICIBankAPIAdapter implements BankAPIAdapter{
    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public double checkBalance(User user) {
        return iciciBankAPI.checkBalance(generateUserToken(user));
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        return iciciBankAPI.transferMoney(generateUserToken(fromUser),
                                            generateUserToken(toUser),
                                            amount);
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return iciciBankAPI.changePin(generateUserToken(user), newPin, currentPin);
    }

    private String generateUserToken(User user){
        return user.getUserName() + user.getPassword(); // random token
    }
}
