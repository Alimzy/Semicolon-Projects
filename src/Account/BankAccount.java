package Account;

public class BankAccount{
    private int balance = 0;

    public int checkBalance() {
//        int balance = 0;
        return balance;
    }

    public void deposit(int amount){
        if(amount < 0) amount =0;

        balance += amount;


    }

    public void withdraw(int amount){
        if(amount >= balance) amount =0;
        if(amount < 0) amount =0;
        balance -= amount;


    }
}


