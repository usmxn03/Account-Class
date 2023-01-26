import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // no-arg constructor
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // constructor with specified id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // accessor and mutator methods
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

    // other methods
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}