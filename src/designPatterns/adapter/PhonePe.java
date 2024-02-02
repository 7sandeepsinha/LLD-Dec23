package designPatterns.adapter;

public class PhonePe {

    private BankAPIAdapter bankAPIAdapter;

    public PhonePe() {
        this.bankAPIAdapter = new ICICIBankAPIAdapter();
        //this.bankAPIAdapter = new YesBankAPIAdapter();
    }

    public void checkBalance(User user){
        double d = bankAPIAdapter.checkBalance(user);
        System.out.println("Balance =  " + d);
    }

    public void transferMoney(User fromUser, User toUser, double amount){
        if(bankAPIAdapter.checkBalance(fromUser) < amount){
            System.out.println("Transaction Failed");
        }
        int status = bankAPIAdapter.doTransaction(fromUser, toUser, amount);
        switch (status){
            case 1:
                System.out.println("SUCCESSFUL");
                break;
            case 0:
                System.out.println("FAILED");
                break;
            default:
                System.out.println("IN PROGRESS");
                break;
        }
        //deduct amount
    }
}
