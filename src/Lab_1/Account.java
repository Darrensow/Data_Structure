package Lab_1;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    protected int id;
    protected double balance, annualInterestRate;
    protected java.util.Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return this.balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal failed.");
            System.out.println("Amount exceeds account balance");
        }
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit successful");
    }
}

class Test {
    public static void main(String[] args) {
        /*
        Account acc = new Account(1122, 200000, 4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println("Balance : " + acc.getBalance());
        System.out.println("Monthly Interest : " + acc.getMonthlyInterest());
        System.out.println("Date created : " + acc.getDateCreated());
         */

        //Question 4
        Account1 acc1 = new Account1(1122, 1000, 1.5, "George");
        acc1.deposit(30);
        acc1.deposit(40);
        acc1.deposit(50);
        System.out.println();
        acc1.withdraw(5);
        acc1.withdraw(3);
        acc1.withdraw(2);
        System.out.println();

        System.out.println("All transactions : ");
        ArrayList<Transactions> list = acc1.getTransactions();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\n____________________________________________________________");
            System.out.println("Account Holder name : " + acc1.getName());
            System.out.println("Annual interest rate : " + acc1.getAnnualInterestRate());
            System.out.println("Date of Transaction : " + list.get(i).getDateOfTransaction());
            System.out.println("Transaction Type : " + list.get(i).getTransactionType());
            System.out.println("Amount : RM " + list.get(i).getAmount());
            System.out.println("Description " + list.get(i).getDescription());
            System.out.println("Balance : RM " + list.get(i).getBalance());
            System.out.println("____________________________________________________________\n");
        }
    }
}

class Transactions {
    private java.util.Date dateOfTransaction;
    private char transactionType;
    private double amount;
    private double balance;
    private String description;

    public Transactions(char transactionType, double amount, double balance, String description) {
        dateOfTransaction = new Date();
        this.transactionType = transactionType;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public char getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }
}

class Account1 extends Account {
    private String name;
    private ArrayList<Transactions> transactions = new ArrayList<>();

    public Account1(String name) {
        this.name = name;
    }

    public Account1(int id, double balance, double annualInterestRate, String name) {
        super(id, balance, annualInterestRate);
        this.name = name;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
            withdrawTransaction(amount, this.balance);
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal failed.");
            System.out.println("Amount exceeds account balance");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }

    @Override
    public void deposit(double amount){
        this.balance += amount;
        depositTransaction(amount, this.balance);
        System.out.println("Deposit successful");
    }

    private void withdrawTransaction(double amount, double balance){
        transactions.add(new Transactions('W', amount, balance, "Withdrawal of RM " + amount ));
    }

    private void depositTransaction(double amount, double balance){
        transactions.add(new Transactions('D', amount, balance, "Deposit of RM " + amount ));
    }
}