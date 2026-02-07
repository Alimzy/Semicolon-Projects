package Account;

public class BankAccount{
    private int balance = 0;
    private int pin;

    BankAccount(int pin){
        this.pin = pin;
    }


    public int checkBalance(int inputPin) {
       if(inputPin != pin){
           return -0000;
       }
            return balance;
    }

    public void deposit(int amount){
        if(amount < 0){
            amount = 0;
        }
        else{
            balance += amount;
        }



    }

    public void withdraw(int amount, int inputPin) {
        if(amount < 0) {
            amount = 0;
        }
        if (amount > balance && inputPin == pin) {
            amount = 0;
        } else if (amount <= balance && inputPin == pin) {
            balance -= amount;
        }

    }
}
