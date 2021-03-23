package Tutorial_1;

public class BankAccount implements Account{
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public int deposit(int input) {
        this.balance += input;
        return this.balance;
    }

    @Override
    public boolean withdraw(int input) {
        if (input > this.balance) {
            this.balance -= input;
            return true;
        } else {
            return false;
        }
    }
}
